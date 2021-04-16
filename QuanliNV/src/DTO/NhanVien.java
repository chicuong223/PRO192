/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author chiuy
 */
public abstract class NhanVien {
    int ma;
    String ten;
    int luongCB;
    int ngayLV;
    
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
    
    public void output(){
        System.out.println("ma: " +ma);
        System.out.println("ten: " +ten);
        System.out.println("luong can ban: " +luongCB);
        System.out.println("so ngay lam vien: " +ngayLV);
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma: ");
        ma=sc.nextInt();
        System.out.print("nhap ten: ");
        sc = new Scanner(System.in);
        ten=sc.nextLine();
        System.out.print("nhap luong can ban: ");
        luongCB=sc.nextInt();
        System.out.print("nhap so ngay lam viec: ");
        ngayLV=sc.nextInt();
    }
    
    public abstract void xepHang();
}
