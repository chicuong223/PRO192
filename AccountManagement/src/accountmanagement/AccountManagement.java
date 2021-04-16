/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountmanagement;

/**
 *
 * @author chiuy
 */
public class AccountManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account a = new Account("Marilyn", 500);
        Account b = new Account("Jay", 200);
        System.out.println("\n" + a);
        System.out.println(b + "\n");
        
        //Change rate
        //Cach 1
        Account.changeRate(0.5f);
        System.out.println(a);
        System.out.println(b + "\n");
        
        //cach 2
        Account.rate = 0.2f;
        System.out.println(a);
        System.out.println(b);
    }
    
}
