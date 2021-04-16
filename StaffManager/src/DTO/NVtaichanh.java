/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author chiuy
 */
public class NVtaichanh extends NhanVien{
    int trocap;
	

    public NVtaichanh() {
        super();
        trocap=0;
    }

    public NVtaichanh(int trocap, int ma, String ten, int luongCB, int ngayLV) {
        super(ma, ten, luongCB, ngayLV);
        this.trocap = trocap;
    }

    public int getTrocap() {
        return trocap;
    }

    public void setTrocap(int trocap) {
        this.trocap = trocap;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        boolean nhaptiep=true;
        do {
        	try {
                System.out.print("nhap so tien tro-cap: ");
                trocap=MyValidation.inputNumber(100000, 1000000);
                nhaptiep=false;
        	}
        	catch(Exception e) {
        		System.out.println("du-lieu khong hop le, vui long nhap lai");
        		nhaptiep=true;
        	}
        }
        while(nhaptiep);
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("tro cap: " +trocap);
    }

    @Override
    public void xepHang() {
        if(trocap>=10 && trocap<=100) System.out.println("Tro-cap binh-thuong");
        else System.out.println("Tro-cap cao");
    }
    
}
