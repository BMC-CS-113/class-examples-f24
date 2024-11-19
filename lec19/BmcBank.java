// Adam Poliak
// 11/21/2023
// BmcBank class that has a list of accounts
// search examples from lecture 21

public class BmcBank {

  private BankAccount[] accounts;

  public BmcBank(int size) {
    this.accounts = new BankAccount[size];
  }

  public boolean contains(String needle) {
    //TODO: implement in class
    return false;
  }

  public static void main(String[] args) {
    BmcBank bank = new BmcBank(6);

    bank.accounts[0] = new BankAccount("kCas", 500000); // add name and balance
    bank.accounts[1] = new BankAccount("Tim", 200000);
    bank.accounts[2] = new BankAccount("Arora", 10);
    bank.accounts[3] = new BankAccount("Adam", 0);
    bank.accounts[4] = new BankAccount("John", 99);

    // does "Adam" have an account with the bank?
    // algorithm to check if Adam has an account:
    // output: boolean: True if yes, otherwise False

    boolean found = bank.contains("Adam");
    System.out.println("Account found: " + found);
    found = bank.contains("Pete");
    System.out.println("Account found: " + found);



    // whats the average amount of money in an account?

    // who has the most amount of money?
    // algoirthm: input: list of accounts, output: the name of the account with the highest balance

    // who has the least amount of money?
  }

}
