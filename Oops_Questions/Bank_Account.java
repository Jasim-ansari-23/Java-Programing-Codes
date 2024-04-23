package Oops_Questions;

public class Bank_Account {
    public static void main(String[] args) {
        Bank_Account JA1234 = new Bank_Account("JA1234", 500.00); // Use double for initial balance
        JA1234.deposit(1000.00); // Use double for deposit amount
        System.out.println("New balance: " + JA1234.getBalance());
    }

    private String acNum;
    private double balance; // Changed type to double

    public Bank_Account(String acNum, double balance) { // Changed argument type to double
        this.acNum = acNum;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class Saving_Account extends Bank_Account {
    public Saving_Account(String acNum, int balance) {
        super(acNum, balance); // Cast to double during construction for initial balance
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Minimum balance required $100");
        } else {
            super.withdraw(amount);
        }
    }
}
