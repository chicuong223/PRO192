/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonemanagement;

/**
 *
 * @author chiuy
 */
public class PhoneManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Phone p = new Phone();
        System.out.println(p);
        Phone p2 = new Phone("Nokia 6", "Nokia", 3300);
        System.out.println(p2);
    }
    
}
