/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

//import java.util.Scanner;

/**
 *
 * @author ChiCuong
 */
public abstract class NhanVien {
    int ma;
    String ten;
    int luongCB;
    int ngayLV;
    String email;
	//private Scanner sc;
    
    public NhanVien(){
        ma=0;
        ten="";
        luongCB=0;
        ngayLV=0;
    }

    public NhanVien(int ma, String ten, int luongCB, int ngayLV) {
        this.ma = ma;
        this.ten = ten;
        this.luongCB = luongCB;
        this.ngayLV = ngayLV;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(int luongCB) {
        this.luongCB = luongCB;
    }

    public int getNgayLV() {
        return ngayLV;
    }

    public void setNgayLV(int ngayLV) {
        this.ngayLV = ngayLV;
    }
    
    public void output() {
    	System.out.println("\n");
        System.out.println("ma: " +ma);
        System.out.println("ten: " +ten);
        System.out.println("email: " +email);
        System.out.println("luong can-ban: " +luongCB);
        System.out.println("so ngay lam viec: " +ngayLV);
    }
    
    public void input() {
        //sc = new Scanner(System.in);
        boolean nhaptiep=true;
        do {
        	try {
        		System.out.print("nhap ma (1-1000): ");
            //    ma=sc.nextInt();
              //  MyValidation.checkNumber(ma, 1, 1000);
        		ma=MyValidation.inputNumber(1, 1000);
                nhaptiep = false;
        	}
        	catch (Exception e) {
        		System.out.println("ma khong hop le");
        		nhaptiep=true;
        	}
        }
        while(nhaptiep);
        nhaptiep=true;
        do {
        	try {
        		System.out.print("nhap ten: ");
                ten=MyValidation.inputString();
                nhaptiep=false;
        	}
        	catch (Exception e) {
        		System.out.println("ten khong hop le");
        		nhaptiep=true;
        	}
        }while(nhaptiep);
        nhaptiep=true;
        do {
        	try {
        		System.out.print("nhap dia-chi email: ");
        		email = MyValidation.inputString("^[\\w+_.-]+@(.+)$");
        		nhaptiep=false;
        	}
        	catch(Exception e) {
        		System.out.println("email khong hop le");
        		nhaptiep=true;
        	}
        }
        while(nhaptiep);
        
        nhaptiep=true;
        do {
        	try {
        		
        		 System.out.print("nhap luong can ban (1000000 - 10000000): ");
        	     luongCB=MyValidation.inputNumber(1000000, 10000000);
        	     nhaptiep=false;
        	}
        	catch (Exception e) {
        		System.out.println("Luong sai");
        		nhaptiep=true;
        	}
        }
        while(nhaptiep);
        do {
        	try {
        		
        		 System.out.print("nhap ngay lam viec (1-30): ");
        	     ngayLV=MyValidation.inputNumber(1, 30);
        	     nhaptiep=false;
        	}
        	catch (Exception e) {
        		System.out.println("ngay lam viec sai");
        		nhaptiep=true;
        	}
        }
        while(nhaptiep);
    }
    
    public abstract void xepHang();
}
