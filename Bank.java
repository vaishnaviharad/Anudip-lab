package demo;

public class Bank {
    // static variable for balance
    static double amount = 10000; // starting balance

    // withdraw method
    public static void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount)
                ? "Withdrawal successful"
                : "Insufficient balance";

        System.out.println(message);

        // update balance if enough money
        amount = (withdrawalAmount <= amount) ? (amount - withdrawalAmount) : amount;
    }

    // deposit method
    public static void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful");
    }

    // display balance
    public static void displayBalance() {
        System.out.println("Total Balance: " + amount);
    }

    // main method
    public static void main(String[] args) {
        withdraw(5000);         // withdraw 5000
        deposit(5000);          // deposit 5000
        displayBalance();       // show final balance
    }
}
