// Adam Poliak + ChatGPT
// 11/05/2024
// Class for a bank account

public class BankAccount {
    // Instance variables
    String accountNumber;
    String accountHolderName;
    private double balance;
    private String password;

   public BankAccount() {
      this.accountNumber = "Missing Account Number";
      this.accountHolderName = "Missing Holder Name";
      this.balance = 100.;
      this.password = "Password1";
   }

   public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.password = "Password1";
   }

    // value Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance,
                       String password) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.password = password;
    }

    // Get account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Get account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    private boolean checkPassword(String password) {
       if (password != this.password) { 
           System.out.println("Wrong password buddy, no access for youy sucker!");
      }
      return password == this.password;
    }

    // Deposit money
    public void deposit(double amount, String password) {
        if (!checkPassword(password)) {
           return;
        }
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw money
    public void withdraw(double amount, String password) {
        if (!checkPassword(password)) {
           return;
        }
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Transfer funds to another account
    public void transfer(BankAccount targetAccount, double amount, String password) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount, password);
            targetAccount.deposit(amount, password);
            System.out.println("Transferred: $" + amount + " to account " + targetAccount.getAccountNumber());
        } else {
            System.out.println("Transfer failed. Check the amount and balance.");
        }
    }

    // Display account details
    public String toString() {
        String output = "Account Number: " + accountNumber + "\n";
        output += "Account Holder Name: " + accountHolderName + " \n";
        output += "Balance: $" + balance;
        return output;
    }

   public static void main(String[] args) {
     BankAccount acc1 = new BankAccount("1", "KCass", 600);
     BankAccount acc2 = new BankAccount("2", "Wendy R", 400);

    System.out.printf("Acc1's accountNumber is %s\n", acc1.accountNumber);
    System.out.printf("Acc2's accountNumber is %s\n", acc2.accountNumber);

    System.out.println(acc1);
    acc1.deposit(1000, "Password1");
    System.out.println(acc1);

    System.out.println(acc2);
    acc2.withdraw(300, "Password1");
    System.out.println(acc2);
   }
}

