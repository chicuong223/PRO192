/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopmanagement;

import java.util.Scanner;

/**
 *
 * @author chiuy
 */
public class LaptopManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int serial[];
        serial = new int[9];
        int gen;
        int price;
        String name, model;
        float size;
        Laptop lap = new Laptop();
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine();
        sc = new Scanner (System.in);
        System.out.print("CPU model: ");
        model = sc.nextLine();
        do{
                System.out.print("Gen: ");
                gen = sc.nextInt();
                if (gen<2 || gen>10 || gen==3) System.out.println("Invalid generation! Please try again!");
        }while(gen<2 || gen>10 || gen==3);
        
        do{
            System.out.print("Screen size: ");
            size=sc.nextFloat();
            if(size != 13.3f && size != 14 && size != 15) System.out.println("Invalid size! Please try again!");
        }while(size != 13.3f && size != 14 && size != 15);
        
        do{
                System.out.println("Serial number: ");
                for(int i=0; i<9; i++){
                    serial[i] = sc.nextInt();
                }
                lap.serial = serial;
                if (lap.checkSerial(serial) == false) System.out.println("Invalid serial number! Please try again!");
        }while (lap.checkSerial(serial) == false);
         
        System.out.print("Price: ");
        price = sc.nextInt();
        lap = new Laptop(name, price, serial, size, gen, model);
        System.out.println(lap);
        System.out.println(lap.isHighPrice(price));
    }
}
