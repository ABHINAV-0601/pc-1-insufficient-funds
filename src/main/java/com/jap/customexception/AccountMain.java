package com.jap.customexception;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(5000);
       //account.withdraw(5100);
        int newBalance = account.withdraw(500);
        System.out.println("New Balance after withdrawing amount is : $"+ newBalance);
        /*try{
            account.withdraw(5100);
        }catch(InsufficientFundException e){
            System.out.println(e);
            e.printStackTrace();
        }*/
    }
}
