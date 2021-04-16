/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

import java.util.Scanner;

/**
 *
 * @author chiuy
 */
public class PhanSo {
    //fields
    private int tu, mau;
    //constructor
    public PhanSo(){
        tu=0;
        mau=0;
    }
    
    public PhanSo(int t, int m){
        tu=t;
        mau=m;
    }
    //setter
    void setTu(int tu){
        if(tu>0)
            this.tu=tu;
    }
    
    void setMau(int mau){
        if(mau>0)
            this.mau=mau;
    }
    //getter
    int getTu(){
        return tu;
    }
    
    int getMau(){
        return mau;
    }
    //Ham khac
    //ham nhap
    void input(){
        do{
            Scanner sc= new Scanner(System.in);
            System.out.print("Tu so: ");
            tu=sc.nextInt();
            System.out.print("Mau so: ");
            mau=sc.nextInt();
        }
        while(mau==0);
    }
    //ham xuat
    void output(){
        System.out.print("" +tu);
        System.out.println("/" +mau);
    }
    
    //ham tinh tong
    PhanSo tong(PhanSo p2){
        int maut, tut;
        maut=p2.mau * mau;
        tut = p2.tu*mau + tu*p2.mau;
        PhanSo pt=new PhanSo();
        pt.tu=tut;
        pt.mau=maut;
        return pt;
    }
    
    //ham tinh hieu
    PhanSo hieu(PhanSo p2){
        int mauh, tuh;
        mauh=p2.mau * mau;
        tuh = tu*p2.mau - p2.tu*mau;
        PhanSo ph=new PhanSo();
        ph.tu=tuh;
        ph.mau=mauh;
        return ph;
    }
    
    //ham tinh tich
    PhanSo tich(PhanSo p2){
        int mauti, tuti;
        mauti = p2.mau * mau;
        tuti = p2.tu * tu;
        PhanSo pti = new PhanSo();
        pti.tu = tuti;
        pti.mau = mauti;
        return pti;
    }
    
    //ham tinh thuong
    PhanSo thuong(PhanSo p2){
        int mauth, tuth;
        mauth = mau * p2.tu;
        tuth = tu * p2.mau;
        PhanSo pth = new PhanSo();
        pth.tu = tuth;
        pth.mau = mauth;
        return pth;
    }
}