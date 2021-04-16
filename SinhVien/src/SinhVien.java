
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chiuy
 */
public class SinhVien {
    //field
    private int ma;
    private String ten;
    
    //methods
    //constructor
    public SinhVien()
    {   ma=0;
        ten="";
    }
    //constructor with parametre
    public SinhVien(int ma, String ten){
        this.ma=ma;
        this.ten=ten;
    }
    
    public SinhVien(SinhVien sv){
        ma=sv.ma;
        ten=sv.ten;
    }
    //setter
        //ham de sua field ma
        void setMa(int mamoi){
            if (mamoi>0)
            ma=mamoi;
        }
        //ham de sua field ten
        void setTen(String ten){
           //if (tenmoi.isEmpty()) cách 1
              if(ten.equals("")) //cách 2
                  this.ten=ten;
        }
    //getter
        //ham de lay ten sinh vien
        String getTen(){
            return ten;
        }
        //ham lay ma sinh vien
        int getMa(){
            return ma;
        }
    //ham xu li khac
    //ham nhap vao ban phim ma va ten
    void nhap()
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ma: ");
        ma=sc.nextInt();
        sc=new Scanner(System.in);
        System.out.println("nhap ten: ");
        ten=sc.nextLine();
    }
    void xuat()
    {
        System.out.println("ma: " + ma);
        System.out.println("ten: " + ten);
    }
    
}
