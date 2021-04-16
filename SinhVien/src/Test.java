/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chi-Cuong
 */
public class Test {
    public static void main(String[] args) {
        //khai bao 1 vung nho de chua ma, ten cho SV thu 1
       
        SinhVien a=new SinhVien();
        //Class        //Constructor
        
        a.nhap();
        System.out.println("Sinh vien thu 1");
        a.xuat();
        
        //khai bao 1 vung nho de chua ma, ten cho SV thu 2
        SinhVien b=new SinhVien();
        b.nhap();
         System.out.println("Sinh vien thu 2");
        b.xuat();
        
        //SV thu 3
        int m=4;
        String t="Lan";
        SinhVien c = new SinhVien(m, t);
        int mamoi=5;
        c.setMa(mamoi);
        c.setTen("");
         System.out.println("Sinh vien thu 3");
        c.xuat();
        //xuat ten SV thu 3
        System.out.println("Ten SV thu 3: " +c.getTen());
        //SV thu 4
        SinhVien d=new SinhVien(c);
         System.out.println("Sinh vien thu 4");
        d.xuat();
        //xuat ma SV thu 4
        System.out.println("Ma SV thu 4: " +d.getMa());
    }
}
