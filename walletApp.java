class wallet {
  private double balance;

  void deposit(double amount) {
    this.balance += amount;
  }

  void withdraw(double amount) {
    if (balance - amount <= 0) {
      System.out.println("You have no sufficient balance");
      return;
    }
    this.balance -= amount;
  }

  double showBalance() {
    return balance;
  }
}

public class walletApp {
  public static void main(String[] args) {
    wallet w1 = new wallet();
    w1.deposit(20938);
    w1.withdraw(3434);
    System.out.println(w1.showBalance());
  }

}

// You need to build a tiny Wallet App for a student club. Each member has a
// wallet that stores money.
// Task#01: Implement a tiny program with two variables balance_1 and balance_2
// of two wallet.
// Write two functions deposit(balance, amount) and withdraw(balance, amount)
// that return the new
// balance. In main, call them and print results.
// Task#02: Convert the procedural version into a Wallet class that holds
// balance as a private
// attribute and
// has methods deposit(amount) and withdraw(amount). Use this keyword where
// appropriate.
// Task#03: Each wallet must have a unique, unchangeable id
// construct a wallet:
// ➔ Wallet() → default initial balance 0
// ➔ Wallet() → given initial balance
// Use a counter to generate ids