package oops.account;

import java.util.Scanner;

public class AccountTester {
    static int accountNo, accountBalance;
    static String accountType;

    public static void main(String[] args) {
        int counter = 0, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Account Number:");
        accountNo = sc.nextInt();
        System.out.println("Account Type: ");
        System.out.println("Press 1 for Saving Account");
        System.out.println("Press 2 for Current Account");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.println("You Have Selecting Saving Account");
                accountType = "Saving";
                display();
                break;
            case 2:
                System.out.println("You Have Selecting Current Account");
                accountType = "Current";
                display();
                break;
            default:
                System.out.println("Invalid Inout!");
        }
    }

    static void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Account Balance");
        accountBalance = sc.nextInt();
        int counter = 0, count = 0;
        BankAccount bankAccount = new BankAccount(accountNo, accountBalance);
        bankAccount.setAccountType(accountType);

        while (counter == 0) {
            System.out.println("\nPlease select the services You Want");
            System.out.println("Press-1 for Deposit");
            System.out.println("Press-2 for WithDraw");
            System.out.println("Press-3 for Display Account Details");
            System.out.println("Press-4 for Display Your Balance");
            System.out.println("Press-5 for exits");
            count = sc.nextInt();

            switch (count) {
                case 1:
                    System.out.println("Enter amount to be deposit");
                    bankAccount.deposit(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter amount to be withdraw");
                    bankAccount.withdrawn(sc.nextInt());
                    break;
                case 3:
                    System.out.println(bankAccount.dispAccountDetails());
                    break;
                case 4:
                    System.out.println("Your Balance is :" + bankAccount.getAccountBalance());
                    break;
                case 5:
                    counter++;
                    break;
                default:
                    System.out.println("please press valid input");
                    break;
            }
        }
    }
}