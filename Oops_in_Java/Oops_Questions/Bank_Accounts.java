package Oops_in_Java.Oops_Questions;

public class Bank_Accounts {
    public static class Bank_Account{
        private int account_number;
        String account_holder_name;
        private double balance;
        public Bank_Account(int account_number, String account_holder_name, double balance){
            this.account_number = account_number;
            this.account_holder_name = account_holder_name;
            this.balance = balance;
        }
        public void deposit(double amount){
            balance += amount;
        }
        public void withdrawal(double amount){
            if(balance >= amount){
                balance -= amount;
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
        public double getBalance(){
            return balance;
        }
    }
    
    public class Saving_Account extends Bank_Account {
        public Saving_Account(int account_number, String account_holder_name, double balance) {
            super(account_number, account_holder_name, balance);
        }
        public void withdrawal(double amount){
            if(getBalance() - amount < 100){
                System.out.println("Maintain your account balance, which is $100 required");
            }
            else{
                super.withdrawal(amount);
            }
        }
    }
    public static void main(String args[]){
        Bank_Account bc = new Bank_Account(12456, "Mohammad Jasim", 500);
        System.out.println("Account number: "+ bc.account_number);
        System.out.println("Account holder name: "+ bc.account_holder_name);
        System.out.println("Deposit $500");
        bc.deposit(1000);
        System.out.println("New balance after deposit: "+ bc.getBalance());

        System.out.println("Withdrawal $600");
        bc.withdrawal(600);
        System.out.println("New balance after $600 withdrawal: "+ bc.getBalance());
    }
}
