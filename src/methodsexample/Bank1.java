package methodsexample;
import java.util.Scanner;

public class Bank1 {
    private int balance;
    private int deposit;
    private int withdraw;

    public void withdraw() {
        int newBalance = balance - withdraw;
        if (newBalance < 0) {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        } else {
            balance = newBalance;
            System.out.println("After withdrawal, current balance in my account: " + balance);
        }
    }
    public void depositMoney() {
        int newBalance = balance + deposit;
        balance = newBalance;
        System.out.println("Deposit of " + deposit + " successful. New balance: " + balance);
    }
    public void balanceChecking() {
        System.out.println("Current balance: " + balance);
    }
    public static void main(String[] args) {
        Bank1 bank = new Bank1();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        bank.balance = scanner.nextInt();
        System.out.print("Enter deposit amount: ");
        bank.deposit = scanner.nextInt();
        System.out.print("Enter withdrawal amount: ");
        bank.withdraw = scanner.nextInt();
        bank.withdraw();
        bank.depositMoney();
        bank.balanceChecking();
        scanner.close();
    }
}
