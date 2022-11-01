package OOPS;

class setAccountDetails {
    private int accountNo;
    private String accountType;
    private int accountBalance, withDrawnBal, depositedBal, DepAmount, WithAmount;

    public setAccountDetails(int accountNo, String accountType, int accountBalance, int depAmount, int withAmount) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        DepAmount = depAmount;
        WithAmount = withAmount;
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
public class AccountConstructor{
    public static void main(String[] args) {
        setAccountDetails bankAccount = new setAccountDetails(5656589 , "Saving", 56000 , 5000 , 8600);
        bankAccount.withdrawn();
        bankAccount.deposit();
        bankAccount.dispAccountDetails();
    }
}