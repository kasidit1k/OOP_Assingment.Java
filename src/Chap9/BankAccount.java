package Chap9;

import java.awt.Color;

public class BankAccount {

    private int accountNo;
    private String accountName;
    private double balance;

    public BankAccount(int accountNo, String accountName, double balance) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
    }

    //Getter
    public int getAccountNo() {
        return accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    //Setter
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println("ฝากเงิน : " + amount);
        balance += amount;
    }

    public void withdraw(double amount) {
        System.out.println("ถอนเงิน : " + amount);
        balance -= amount;
    }

    public void printDetails() {
        System.out.println("---------------------------------------");
        System.out.println("AccountNo : " + accountNo);
        System.out.println("AccountName : " + accountName);
        System.out.println("Balance : " + balance);
        System.out.println("---------------------------------------");
    }
}

// -- SavingAccount -- //
class SavingAccount extends BankAccount {

    private SavingAccount(int accountNo, String accountName, double balance) {
        super(accountNo, accountName, balance);
    }

    public static SavingAccount createSV(int accountNo, String accountName, double balance) {
        if (balance >= 100) {
            
            return new SavingAccount(accountNo, accountName, balance);
        } else {
            System.out.println("ไม่สามารถเปิดบัญชีได้ จำนวนเงินฝาก < 100!!!");
            return null;
        }
    }

    @Override
    public void withdraw(double amount) {
        double newbalance = getBalance() - amount;
        if (newbalance >= 50) {
            System.out.println("ถอนเงิน : "+amount);
            setBalance(newbalance);
        } else {
            System.out.println("ไม่สามารถถอนออกได้!!!");
        }
    }
}


// -- FixedDepositAccount -- //
class FixedDepositAccount extends BankAccount {
    private FixedDepositAccount(int accountNo, String accountName, double balance) {
        super(accountNo, accountName, balance);
    }

    public static FixedDepositAccount createSV(int accountNo, String accountName, double balance) {
        if (balance >= 1000) { 
            return new FixedDepositAccount(accountNo, accountName, balance);
        } else {
            System.out.println("ไม่สามารถเปิดบัญชีได้!!!");
            return null;
        }
    }
    @Override
    public void withdraw(double amount) {
        if (amount >= 500) {
            System.out.println("ถอนเงิน : " + amount);
            setBalance(getBalance() + amount);
        } else {
            System.out.println("Error : ไม่สามารถฝากเงินได้!!!");
        }
    }
}
