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
public class NVketoan extends NhanVien{
    int namKN;
	private Scanner sc;

    public NVketoan() {
        super();
        namKN=0;
    }

    public NVketoan(int namKN, int ma, String ten, int luongCB, int ngayLV) {
        super(ma, ten, luongCB, ngayLV);
        this.namKN = namKN;
    }

    public int getNamKN() {
        return namKN;
    }

    public void setNamKN(int namKN) {
        this.namKN = namKN;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        boolean nhaptiep=true;
        do {
        	try {
        		sc = new Scanner(System.in);
                System.out.print("nhap so nam kinh-nghiem: ");
                namKN=sc.nextInt();
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
        System.out.println("nam kinh nghiem: " +namKN);
    }

    @Override
    public void xepHang() {
        if(namKN>=1 && namKN<=5) System.out.println("Hang: thuong");
        else System.out.println("Hang: cuoi");
    }
    
}
