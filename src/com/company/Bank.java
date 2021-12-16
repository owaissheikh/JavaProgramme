package com.company;

public class Bank {
    private double totalFund;
    private double withdrawFund;

    public Bank(double totalFundnd){
        this.totalFund = totalFund;
    }

    public void withdrw(double debit){
        totalFund -= debit;
        System.out.println("withdraw  success  " +
                "amount availabe amount is " + totalFund);
    }

    public double getTotalFund() {
        return totalFund;
    }

    public void setTotalFund(double totalFund) {
        this.totalFund = totalFund;
    }

    public double getWithdrawFund() {
        return withdrawFund;
    }

    public void setWithdrawFund(double withdrawFund) {
        this.withdrawFund = withdrawFund;
    }


}