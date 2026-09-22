import java.util.ArrayList;

class Bank {
  ArrayList<Account> BankAccount = new ArrayList<>();

  public void add(Account a) {
    BankAccount.add(a);
    System.out.println("add :" + a);
  }

  public void remove(String account_no) {
    for (int i = 0; i < BankAccount.size(); i++) {
      if (BankAccount.get(i).getAccountNo() == account_no) {
        BankAccount.remove(i);
        i--;
        System.out.println("remove account with accountNO:" + account_no);
      }
    }
  }

  public void accountList() {
    for (int i = 0; i < BankAccount.size(); i++) {
      System.out.println("Account Number: " + (i + 1));
      System.out.println("Account Name: " + BankAccount.get(i).getAccountName());
      System.out.println("Account NO: " + BankAccount.get(i).getAccountNo());
      System.out.println("Account Total Balance: " + BankAccount.get(i).getAccountBalance());

    }
  }
}

class Account {
  private String name;
  private String account_no;
  private double balance;

  Account(String name, String account_no, double balance) {
    this.name = name;
    this.balance = balance;
    this.account_no = account_no;
  }

  public String getAccountNo() {
    return account_no;
  }

  public String getAccountName() {
    return name;
  }

  public double getAccountBalance() {
    return balance;
  }

  public void deposit(double amount) {
    balance = amount + balance;
  }

  public void withdraw(double amount) {
    if (amount > balance) {
      System.out.println("Your account has no this amount of Money try less");
    } else {
      System.out.println("withdraw sucessfully: " + amount);
    }
  }

}

public class BankAccount {
  public static void main(String[] args) {
    Account a1 = new Account("Tanvir", "109823828423", 138334.324);
    Account a2 = new Account("Milon", "1038494082384", 2843284.2348);
    Account a3 = new Account("Fahim", "18328342484", 84879384.834);
    Bank b = new Bank();
    b.add(a1);
    b.add(a2);
    b.add(a3);
    b.accountList();
    b.remove("1038494082384");
    System.out.println();
    b.accountList();
  }
}
