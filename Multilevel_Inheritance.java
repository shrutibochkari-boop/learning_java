/*	we can take Account as a base class with common functionality like Deposit and Withdraw. Then, SavingsAccount inherits from Account and adds extra behavior like applying interest.This way, inheritance avoids code duplication and gives us reusability
 */

// Base Class
class Account {
  String accountHolder;
  double balance;

  void deposit(double amount) {
    balance += amount;
    System.out.println("Deposited " + amount + ". New balance: " + balance);
  }
}

// Derived Class
class SavingsAccount extends Account {
  double interestRate;

  void applyInterest() {
    double interest = balance * interestRate / 100;
    balance += interest;
    System.out.println("Interest Applied: " + interest +"to" + accountHolder + ". New Balance: " + balance);
  }
}
 class PremiumSavingAccount extends SavingsAccount{
    double bonusRate;

    void applybonusRate(){
        double bonus = balance * bonusRate / 100;
        balance += bonus;
         System.out.println("Premium Interest Applied: " + bonus +"to" + accountHolder + ". New Balance: " + balance);
    }
 }

public class Multilevel_Inheritance {
  public static void main(String[] args) {
    PremiumSavingAccount psa = new PremiumSavingAccount();
    psa.accountHolder = "Pranav";
    psa.balance = 2000;
    psa.interestRate = 5;
    psa.bonusRate = 2;
    psa.deposit(1000);
    psa.applyInterest(); // Inherited from Account
    psa.applybonusRate(); // Defined in SavingsAccount

  }
}
