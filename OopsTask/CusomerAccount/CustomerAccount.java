package oops.CusomerAccount;

public class CustomerAccount {
    private int acctId;
    private String acctType;
    private double acctBalance;
    public int getAcctId() {
        return acctId;
    }
    public void setAcctId(int acctId) {
        this.acctId = acctId;
    }
    public String getAcctType() {
        return acctType;
    }
    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }
    public double getAcctBalance() {
        return acctBalance;
    }
    public void setAcctBalance(double acctBalance) {
        this.acctBalance = acctBalance;
    }
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