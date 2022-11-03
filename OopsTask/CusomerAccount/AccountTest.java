package oops.CusomerAccount;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Id , AccId;
        String Name, Address , Type ;
        double Balance = 0;
            System.out.println("Enter Customer Id: ");
            Id = Integer.parseInt(sc.next());

            System.out.println("Enter Customer Name: ");
            Name = sc.next();

            System.out.println("Enter Customer Address: ");
            Address = sc.next();

            System.out.println("Enter Account Id: ");
            AccId = Integer.parseInt(sc.next());

            System.out.println("Enter Account Type: ");
            System.out.println("Press 1 for Saving Account");
            System.out.println("Press 2 for Current Account");
            Type = sc.next();

            switch (Type) {
            case "1":
                System.out.println("You Have Selecting Saving Account");
                Type = "Saving";
                break;
            case "2":
                System.out.println("You Have Selecting Current Account");
                Type = "Current";
                break;
            default:
                System.out.println("Invalid Inout!");
        }
            System.out.println("Enter Account Balance: ");
            Balance = Double.parseDouble(sc.next());

        Customer customer = new Customer(Id, Name, Address);
        CustomerAccount customerAccount = new CustomerAccount(AccId ,Type , Balance);
        customer.display();
        customerAccount.display();
    }
}
