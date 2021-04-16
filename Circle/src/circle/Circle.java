/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;


import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author chiuy
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    //fields
   private double x, y, r;
    
    //constructor
    public Circle(){
        x=0;
        y=0;
        r=0;
    }
    
    public Circle(double h, double t, double b){
        x = h;
        y = t;
        r = b;
    }
    //setter
    void setX(double x){
        this.x=x;
    }
    
    void setY(double y){
        this.y=y;
    }
    
    void setR(double r){
        this.r=r;
    }
    //getter
    double getX(){
        return x;
    }
    
    double getY(){
        return y;
    }
    
    double getR(){
        return r;
    }
    //hàm khác
    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.print("x = ");
        x=sc.nextDouble();
        System.out.print("y = ");
        y=sc.nextDouble();
        System.out.print("r = ");
        r=sc.nextDouble();
    }
    
    void output(){
        System.out.println("Tọa độ tâm");
        System.out.println("x = " +x);
        System.out.println("y = " +y);
        System.out.println("Bán kính");
        System.out.println("r = " +r);
    }
    
    void displayrelationship(Circle c2){
        double d=sqrt((c2.x - x)*(c2.x - x) + (c2.y - y)*(c2.y - y));
        if(d>(r + c2.r)){
            System.out.println("2 hình tròn nầy không giao nhau");
        }
        else if(d==(r + c2.r)){
            System.out.println("2 hình tròn nầy tiếp xúc ngoài");
            }
            else if(d==0){
            System.out.println("2 hình tròn nầy đồng tâm");
                }
                else System.out.println("2 hình tròn nầy giao nhau");
    }
}
