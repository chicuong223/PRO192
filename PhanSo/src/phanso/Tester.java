/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

/**
 *
 * @author chiuy
 */
public class Tester {
    public static void main(String[] args) {
        //Phan so thu 1
        PhanSo a = new PhanSo();
        System.out.println("Phan so thu 1");
        a.input();
        a.output();
        
        //Phan so thu 2
        PhanSo b = new PhanSo();
        System.out.println("Phan so thu 2");
        b.input();
        b.output();
        
        //Phan so tong
        PhanSo t;
        t = a.tong(b);
        System.out.println("Phan so tong");
        t.output();
        
        //Phan so hieu
        PhanSo h;
        h = a.hieu(b);
        System.out.println("Phan so hieu");
        h.output();
        
        //Phan so tich
        PhanSo ti;
        ti = a.tich(b);
        System.out.println("Phan so tich");
        ti.output();
        
        //Phan so thuong
        PhanSo th;
        th = a.thuong(b);
        if(b.getTu() == 0){
            System.out.println("Phan so thuong");
            System.out.println("Khong chia duoc");
        }
        else{
            System.out.println("Phan so thuong");
            th.output();
        }
    }
}

