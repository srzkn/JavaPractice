package day35_OOP_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class BankAccountObjects {
    public static void main(String[] args) {
        BankAccount bankAccount1=new BankAccount("ali kaya", 01, 250000);
        BankAccount bankAccount2=new BankAccount("  ", -31, 0);
        BankAccount bankAccount3=new BankAccount("adem deniz", 22, -400);
        BankAccount bankAccount4=new BankAccount("ayşe toker", 21, 2500);
        BankAccount bankAccount5=new BankAccount("esra toker", 41, 25);
        BankAccount bankAccount6=new BankAccount("ali ataş", 51, 2);
    }

  //  ArrayList<BankAccount>myList=new ArrayList<>(Arrays.asList(bankAccount1, bankAccount2, bankAccount3, bankAccount4, bankAccount5));
}
