package OOPS;

import lombok.Data;

import java.util.Scanner;
@Data
class Customer {
    private int custId;
    private String custName, custAddress;
    Customer(int Id, String Name, String Address) {
        custId = Id;
        custName = Name;
        custAddress = Address;
    }
    void display() {
        System.out.println("Customer Id:    " + getCustId());
        System.out.println("Customer Name:    " + getCustName());
        System.out.println("Customer Address: " + getCustAddress());
    }
}
@Data
class CustomerAccount{
    private int acctId;
    private String acctType;
    private double acctBalance;
    CustomerAccount(int AccId, String Type, double Balance) {
        acctId = AccId;
        acctType = Type;
        acctBalance = Balance;
    }
    void display(){
        System.out.println("Account Id:       " +getAcctId());
        System.out.println("Account Type:     " +getAcctType());
        System.out.println("Account Balance:   "+getAcctBalance());
    }
}
public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Id = 0, AccId = 0;
        String Name = null;
        String Address = null;
        String Type = null;
        double Balance = 0;
        System.out.println("Enter Customer Id: ");
        Id = Integer.parseInt(sc.next());
        System.out.println("Enter Customer Name: ");
        Name = sc.next();
        System.out.println("Enter Customer Address: ");
        Address = sc.next();

        Customer customer = new Customer(Id ,Name, Address);

        System.out.println("Enter Account Id: ");
        AccId = Integer.parseInt(sc.next());
        System.out.println("Enter Account Type: ");
        Type = sc.next();
        System.out.println("Enter Account Balance: ");
        Balance = Double.parseDouble(sc.next());
        CustomerAccount account1 = new CustomerAccount(AccId ,Type , Balance);
        customer.display();
        account1.display();
    }
}