/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountmanagement;

import Validation.MyLine;

/**
 *
 * @author chiuy
 */
public class Account {
    //fields/ instant variables
    String name;
    int balance;
    static float rate; //static variable
    
     
    //class constructor
    static{
        rate = 0.1f;  //this code runs first when the program runs (only once and before main function runs)
        System.out.println("The death of one is a tragedy, the death of a million is just a statistic");
    }
    
    //instant methods
    public Account(){
    name = "";
    balance = 0;
    }

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(MyLine.checkString(name))
                this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "name=" + name + ", balance=" + balance + ", rate=" + rate +'}';
    }
    
    //class method
    public static void changeRate(float newrate){
        if (newrate>=0 && newrate<=1)
            rate = newrate;
    }
}
