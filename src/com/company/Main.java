package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank owaish = new Bank(900);
        owaish.setTotalFund(900);
        System.out.println("total fund in bank is" +
                "  " + owaish.getTotalFund());
        owaish.withdrw(100);


    }
}
