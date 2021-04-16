/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.util.Scanner;

/**
 *
 * @author chiuy
 */
public class ShapeTester {
    public static void main(String[] args) {
        int choice;
        Square sq = null;
        Circle sc = null;
        Rectangle sr = null;
        boolean filled;
        String colour;
        Scanner in=new Scanner(System.in);
        do{
            System.out.println("\n1 - Create a circle");
            System.out.println("2 - Create a rectangle");
            System.out.println("3 - Create a square");
            System.out.println("4 - Show information of created shape");
            System.out.println("Others - Quit");
            System.out.print("Choice: ");
            choice = in.nextInt();
            switch(choice){
                case 1:  double radius;
                            System.out.print("Radius: ");
                            radius = in.nextDouble();
                            while(radius <= 0){
                                System.out.println("Radius > 0. Please try again!");
                                System.out.print("Radius: ");
                                radius = in.nextDouble();
                            }
                            System.out.print("Filled (true or false): ");
                            filled = in.nextBoolean();
                            System.out.print("Colour: ");
                            in = new Scanner(System.in);
                            colour = in.nextLine();
                            sc = new Circle(colour, filled, radius);
                            break;
                case 2:  double length, width;
                            System.out.print("Length: ");
                            length = in.nextDouble();
                            System.out.print("Width: ");
                            width = in.nextDouble();
                            while (length < width || length <= 0 || width <= 0){
                                System.out.println("Length >= Width & Length >0 & Width >0. Please try again!");
                                System.out.print("Length: ");
                                length = in.nextDouble();
                                System.out.print("Width: ");
                                width = in.nextDouble();
                            }
                            System.out.print("Filled (true or false): ");
                            filled = in.nextBoolean();
                            System.out.print("Colour: ");
                            in = new Scanner(System.in);
                            colour = in.nextLine();
                            sr = new Rectangle(width, length, colour, filled);
                            break;
                case 3:  double side;
                            System.out.print("Side: ");
                            side = in.nextDouble();
                            while(side <= 0){
                                System.out.println("Side > 0. Please try again!");
                                System.out.print("Side: ");
                                side = in.nextDouble();
                            }
                            System.out.print("Filled (true or false): ");
                            filled = in.nextBoolean();
                            System.out.print("Colour: ");
                            in = new Scanner(System.in);
                            colour = in.nextLine();
                            sq = new Square(colour, filled, side);
                            break;
                case 4:  if(sc != null){
                                /*System.out.println("\nCircle");
                                System.out.println("Radius: " + sc.radius);
                                System.out.println("Filled: " + sc.filled);
                                System.out.println("Colour: " + sc.colour);
                                System.out.println("Perimetre: " + sc.getPerimetre());
                                System.out.println("Area: " + sc.getArea());*/
                                System.out.println(sc.toString());
                            }
                            if(sr != null){
                                /*System.out.println("\nRectangle");
                                System.out.println("Length: " + sr.length);
                                System.out.println("Width: " + sr.length);
                                System.out.println("Filled: " + sr.filled);
                                System.out.println("Colour: " + sr.colour);
                                System.out.println("Perimetre: " + sr.getPerimetre());
                                System.out.println("Area: " + sr.getArea());*/
                                System.out.println(sr.toString());
                            }
                            if(sq != null){
                                System.out.println(sq.toString());
                            }
                            break;
                
            }
        }while (choice>=1 && choice <=4);
    }
}
