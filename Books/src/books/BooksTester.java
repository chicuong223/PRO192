/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

import static java.awt.Event.ENTER;
import java.util.Scanner;

/**
 *
 * @author chiuy
 */
public class BooksTester {   
    public static void main(String[] args) {
        int choice, code, price, year;
        String title, type;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1 - Create and display a Detective Book");
            System.out.println("2 - Create and display a Science Book");
            System.out.println("Others - Quit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:     sc=new Scanner(System.in);
                               System.out.print("Enter code: ");
                               code = sc.nextInt();
                               System.out.print("Enter title: ");
                               sc=new Scanner(System.in);
                               title = sc.nextLine();
                               System.out.print("Enter price: ");
                               price = sc.nextInt();
                               System.out.print("Enter year of publication: ");
                               year = sc.nextInt();
                               DetectiveBook db=new DetectiveBook(code, title, price, year);
                               db.outputDetectiveBook();
                               break;
                case 2:     sc=new Scanner(System.in);
                               System.out.print("Enter code: ");
                               code = sc.nextInt();
                               System.out.print("Enter title: ");
                               sc=new Scanner(System.in);
                               title = sc.nextLine();
                               ENTER:
                               System.out.print("Enter type (Physics, Mathematics, Chemistry): ");
                               type = sc.nextLine();
                               if(type.equals("Chemistry") == false && type.equals("Mathematics") == false && type.equals("Physics") == false){
                                   System.out.println("Invalid type!");
                                   break;
                               }
                               else{
                                        ScienceBook sb = new ScienceBook(code, title, type);
                                        sc=new Scanner(System.in);
                                        sb.outputScienceBook();
                                        break;
                               }
                default: System.out.println("Goodbye!");
                            break;
            }
        }while (choice>=1 && choice<3);
    }
}
