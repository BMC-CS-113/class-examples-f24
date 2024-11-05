// Adam Poliak
// 11/05/2024
// Custom class for bank

public class Bank {

   String name;
   BankAccount[] accounts;

  // empty constructor - sets default values for instance variables
  public Bank() {
    this.name = "default";
    this.accounts = new BankAccount[2];
  }

  // value constructor
  public Bank(String name, int numClients) {
    this.accounts = new BankAccount[numClients];
    this.name = name;
  }
  
   // add a new bankaccount to the bank, return the index of the new bankaccount
   public int addAccount(BankAccount newAccount) {
     for (int i = 0; i < this.accounts.length; i++) {
        if (this.accounts[i] == null) {
          this.accounts[i] = newAccount;
          return i;
       }
     }
     // uh-oh the bak is full
     System.out.println("Bank is full, go elsehwere, sorry");
     return -1; 
   }

  public String toString() {
     String output = this.name + "\n";
     for (BankAccount acc : this.accounts) {
        if (acc != null) {
          output += acc.toString() + "\n";
       }
     }
     return output; 
  }


  public double totalMoney() {
     double tot = 0.0;
     //for (int i = 0; i < balances.length; i++) {
     //   tot+= balances[i];
     //}
     return tot;
   }

  // tell us how much omey is currently in the bank
  public static double totalMoney(Bank bank) {
    return bank.totalMoney();
   }

  public static double[] makeAccounts(int size ) {
     return new double[size];
  }


  public static double[] expandBank(double[] old) {
     // create a new double array with 2 times the size of the original array
     double[] newAccounts = new double[2*old.length];

     for (int i = 0 ; i < old.length; i++) {
        newAccounts[i] = old[i];
     }
     return newAccounts;
  }

  public static void main(String[] args) {

   Bank bank1 = new Bank("113 BANK",13);
   System.out.println(bank1);
   BankAccount acc2 = new BankAccount("2", "Wendy R", 400);
   bank1.addAccount(acc2);
   System.out.println(bank1);
  }

}
