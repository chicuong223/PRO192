/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diem;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Chi Cuong
 */
public class Diem {
    //fields
   private double x,y;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Diem a = new Diem();
        System.out.println("Nhập tọa độ điểm 1");
        a.nhap();
        a.xuat();
        
        Diem b = new Diem();
        System.out.println("Nhập tọa độ điểm 2");
        b.nhap();
        b.xuat();
        
        System.out.println("Khoảng cách: " + a.khoangcach(b.x, b.y) );
    }
    //methods
    //constructor
    public Diem(){
        x=0;
        y=0;
    }
    
    public Diem(double hoanh, double tung){
        x=hoanh;
        y=tung;
    }
    //setter
    void setX(double x){
        this.x=x;
    }
    
    void setY(double y){
        this.y=y;
    }
    //getter
    double getX(){
        return x;
    }
    
    double getY(){
        return y;
    }
    //hàm xử lí khác
    //hàm nhập
    void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập hoành độ x: ");
        x=sc.nextDouble();
        sc = new Scanner(System.in);
        System.out.println("Nhập tung độ y: ");
        y=sc.nextDouble();
    }
    double khoangcach(Diem d2){
        return sqrt((d2.x-x)*(d2.x-x)+(d2.y-y)*(d2.y-y));
    }
    double khoangcach(double x2, double y2){
        return sqrt((x2 - x)*(x2-x) + (y2-y)*(y2-y));
    }
    void xuat(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    
}
