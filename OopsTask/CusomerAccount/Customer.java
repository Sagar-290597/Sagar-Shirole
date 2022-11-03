package oops.CusomerAccount;

public class Customer {
    private int custId;
    private String custName, custAddress;
    public int getCustId() {
        return custId;
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getCustAddress() {
        return custAddress;
    }
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }
    Customer(int Id, String Name, String Address) {
        custId = Id;
        custName = Name;
        custAddress = Address;
    }
    void display() {
        System.out.println("Customer Id:      " + getCustId());
        System.out.println("Customer Name:    " + getCustName());
        System.out.println("Customer Address: " + getCustAddress());
    }
}
