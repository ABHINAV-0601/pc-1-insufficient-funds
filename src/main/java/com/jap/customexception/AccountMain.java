package com.jap.customexception;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(5000);
        try{
            account.withdraw(5100);
        }catch(InsufficientFundException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
