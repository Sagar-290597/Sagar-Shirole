package OOPS;

import lombok.Data;

import java.util.Scanner;

@Data
class BankAccount {
     private int accountNo;
     private String accountType;
     private int accountBalance, withDrawnBal, depositedBal, DepAmount, WithAmount;
     void setAccountDetails(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter The Account Number:");
         accountNo = sc.nextInt();
         System.out.println("Account Type:");
         accountType = sc.next();
         System.out.println("Account Balance");
         accountBalance = sc.nextInt();
         System.out.println("Enter The Amount To Withdrawn");
         WithAmount = sc.nextInt();
         System.out.println("Enter The Amount To Deposited");
         DepAmount = sc.nextInt();
     }
     void deposit() {
        depositedBal = accountBalance + DepAmount;
     }
     void withdrawn(){
        withDrawnBal = accountBalance - WithAmount;
     }
     void dispAccountDetails(){
         System.out.println("Account Number: " +accountNo);
         System.out.println("Account Type : "+accountType);
         System.out.println("Account Balance : "+ accountBalance);
         System.out.println("Deposited Balance : "+ depositedBal);
         System.out.println("Withdraw Amount : "+ withDrawnBal);
     }
}
public class Account {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountDetails();
        bankAccount.withdrawn();
        bankAccount.deposit();
        bankAccount.dispAccountDetails();
    }
}
