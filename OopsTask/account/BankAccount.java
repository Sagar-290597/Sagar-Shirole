package oops.account;

public class BankAccount {
    private int accountNo;
    private String accountType;
    private int accountBalance, withdrawAmount , depositAmount;
    public BankAccount(int accountNo, int accountBalance) {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public int getAccountBalance() {
        return accountBalance;
    }
    public void withdrawn(int depositAmount) {
        withdrawAmount = depositAmount;
        if (accountBalance >= withdrawAmount) {
            accountBalance = accountBalance - withdrawAmount;
            System.out.println("Please collect your money :" + withdrawAmount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public void deposit(int depositAmount) {
        this.depositAmount = depositAmount;
        accountBalance += depositAmount;
        System.out.println("Your Money has been successfully deposited :" + accountBalance);

    }
    String dispAccountDetails(){
        return "Account Number: " +accountNo + "\nAccount Balance: " +accountBalance + "\nAccount Type: " +accountType
                +"\nDeposited Balance: " +accountBalance +"\nWithdraw Amount: " +accountBalance;

    }
}
