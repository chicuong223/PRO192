/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import java.util.Scanner;

/**
 *
 * @author chiuy
 */
public class ProductTest {
    private static Scanner sc;
	//check valid date
     static boolean validDate(int d, int m, int y){
       int maxd=31;
       if(d<1 || d>maxd || m<1 || m>12) return false;
       if(m==4 || m==6 || m==9 || m==11) maxd=30;
       else if(m==2){
           if(y%400==0 || (y%4==0 && y%100!=0)) maxd=29;
           else maxd=28;
       }
       return maxd<=31;
   }
     //main function
    public static void main(String[] args) {
        int choice, code, price, guaranty, voltage, power, d1, m1, y1, d2, m2, y2;
        String name, type, make;
        Electric ep = null;
        Ceramic cp = null;
        Food fp = null;
        sc = new Scanner(System.in);
        do{     
                //menu
                System.out.println("1 - Enter a electric product");
                System.out.println("2 - Enter a ceramic product");
                System.out.println("3 - Enter a food product");
                System.out.println("4 - Print out entered products");
                System.out.println("Others - Quit");
                System.out.print("Your choice: ");
                choice = sc.nextInt();
                
                switch(choice){
                    case 1: System.out.print("Enter code: ");
                               code = sc.nextInt();
                               System.out.print("Enter name: ");
                               sc = new Scanner(System.in);
                               name = sc.nextLine();
                               System.out.print("Enter make: ");
                               sc = new Scanner(System.in);
                               make = sc.nextLine();
                               System.out.print("Enter price: ");
                               price = sc.nextInt();
                               System.out.print("Enter guaranty: ");
                               guaranty = sc.nextInt();
                               System.out.print("Enter voltage: ");
                               voltage = sc.nextInt();
                               System.out.print("Enter power: ");
                               power = sc.nextInt();
                               ep = new Electric(code, name, make, price, guaranty, voltage, power);
                               break;
                    case 2: System.out.print("Enter code: ");
                               code = sc.nextInt();
                               System.out.print("Enter name: ");
                               sc = new Scanner(System.in);
                               name = sc.nextLine();
                               System.out.print("Enter make: ");
                               sc = new Scanner(System.in);
                               make = sc.nextLine();
                               System.out.print("Enter price: ");
                               price = sc.nextInt();
                               System.out.print("Enter type: ");
                               sc = new Scanner(System.in);
                               type = sc.nextLine();
                               cp = new Ceramic(code, name, make, price, type);
                               break;
                    case 3: System.out.print("Enter code: ");
                               code = sc.nextInt();
                               System.out.print("Enter name: ");
                               sc = new Scanner(System.in);
                               name = sc.nextLine();
                               System.out.print("Enter make: ");
                               sc = new Scanner(System.in);
                               make = sc.nextLine();
                               System.out.print("Enter price: ");
                               price = sc.nextInt();
                               do{
                                       System.out.println("Enter manufacture date: ");
                                       sc=new Scanner(System.in);
                                       String date = sc.nextLine();            
                                       d1 = Integer.parseInt(date.split("/")[0]);
                                       m1 = Integer.parseInt(date.split("/")[1]);
                                       y1= Integer.parseInt(date.split("/") [2]);
                               }while (!validDate(d1, m1, y1));
                               do{
                                        System.out.println("Enter expiration date: ");
                                        sc=new Scanner(System.in);
                                        String date2 = sc.nextLine();
                                        d2 = Integer.parseInt(date2.split("/") [0]);
                                        m2 = Integer.parseInt(date2.split("/") [1]);
                                        y2 = Integer.parseInt(date2.split("/") [2]);
                               }while (!validDate(d2, m2, y2) || y2<y1 || (y2==y1 && m2<m1));
                               fp = new Food(code, name, make, price, d1, m1, y1, d2, m2, y2);
                               break;
                    case 4:  
                                if(ep!=null){
                                    System.out.println("Electric product: ");
                                    ep.outputE();
                                }
                               if(cp!=null){
                                   System.out.println("Ceramic product: ");
                                   cp.outputC();
                               }
                               if(fp!=null){
                                   System.out.println("Food product: ");
                                   fp.outputF();
                               }
                }
        }while (choice>=1 && choice <=4);
                
    }
}
