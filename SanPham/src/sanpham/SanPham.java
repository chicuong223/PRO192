/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanpham;

import java.util.Scanner;

/**
 *
 * @author chiuy
 */
public class SanPham {
    //field
   private int ma;
   private String ten;
   private float gia;
   private float giamgia;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SanPham a= new SanPham();
        a.nhap();
        a.xuat();
        
        SanPham b= new SanPham();
        b.nhap();
        b.xuat();
        
        SanPham c= new SanPham();
        c.nhap();
        c.xuat();
    }
    //constructor
    public SanPham(){
        ma=0;
        ten="";
        gia=0;
        giamgia=0;
    }
    
    public SanPham(int MA, String TEN, float GIA, float GIAMGIA){
        ma=MA;
        ten=TEN;
        gia=GIA;
        giamgia=GIAMGIA;
    }
    
    public SanPham(SanPham sp){
        ma=sp.ma;
        ten=sp.ten;
        gia=sp.gia;
        giamgia=sp.giamgia;
    }
    //setter
    void setMa(int ma){
        if(ma>0)
            this.ma=ma;
    }
    
    void setTen(String ten){
        if(!ten.equals(""))
            this.ten=ten;
    }
    
    void setGia(float gia){
        if(gia>0)
            this.gia=gia;
    }
    
    void setGiamgia(float giamgia){
        if(giamgia>0)
            this.giamgia=giamgia;
    }
    //getter
    int getMa(){
        return ma;
    }
    
    String getTen(){
        return ten;
    }
    
    float  getGia(){
        return gia;
    }
    
    float getGiamgia(){
        return giamgia;
    }
    //hàm xử lí khác
    //hàm nhập
      void nhap(){
          Scanner sc=new Scanner(System.in);
          System.out.println("nhap ma: ");
          ma=sc.nextInt();
          sc=new Scanner(System.in);
          System.out.println("nhap ten: ");
          ten=sc.nextLine();
          sc=new Scanner(System.in);
          System.out.println("nhap gia: ");
          gia=sc.nextFloat();
          sc=new Scanner(System.in);
          System.out.println("nhap giam gia: ");
          giamgia=sc.nextFloat();
      }
      //hàm tính giá sau giảm
      float giagiam(){
          float giasaugiam=gia*(1-giamgia);
          return giasaugiam;
      }
      //hàm xuất
      void xuat(){
          System.out.println("Ma: " + ma);
          System.out.println("Ten: " + ten);
          System.out.println("Gia sau giam: " + giagiam());
      }
}
