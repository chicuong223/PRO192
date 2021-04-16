/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlinv;

import DTO.NVketoan;
import DTO.NVtaichanh;
import DTO.NhanVien;
import Manager.DanhSachNV;
import java.util.Scanner;

/**
 *
 * @author chiuy
 */
public class Test {
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
        DanhSachNV obj=new DanhSachNV();
        do{
            System.out.println("1 - Them 1 nhan-vien");
            System.out.println("2 - Xuat danh sach");
            System.out.println("3 - Tim kiem nhan-vien");
            System.out.println("4 - Xoa 1 nhan-vien");
            System.out.println("5 - Chinh-sua thong-tin nhan-vien");
            System.out.println("6 - Sap-xep danh sach");
            System.out.println("7 - Thoat");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1: 
                    System.out.println("1.1 - Nhan-vien tai-chanh");
                    System.out.println("1.2 - Nhan-vien ke-toan");
                    System.out.print("Nhap lua chon: ");
                    int loaiNV=sc.nextInt();
                    NhanVien x=null;
                    if(loaiNV==1)
                    {
                        x = new NVtaichanh();
                        x.input();
                    }
                    else
                    {
                        x = new NVketoan();
                        x.input();
                    }
                    if(obj.themNV(x)==true) System.out.println("Added");
                    else System.out.println("Failed");
                    break;
                case 2:
                    obj.xuatDSNV();
                    //obj.xuatNVTC();
                    break;
                case 3:
                    int maTim;
                    System.out.print("Nhap ma nhan-vien can tim: ");
                    maTim=sc.nextInt();
                    /*int viTri=obj.timKiem(maTim);
                    if(viTri==-1) System.out.println("Ko tim thay");
                    else{
                        System.out.println("Da tim thay");
                        obj.getList()[viTri].output();
                    }*/
                    NhanVien kq=obj.timKiem2(maTim);
                    if(kq==null) System.out.println("Khong tim thay");
                    else{
                        System.out.println("Da tim thay");
                        kq.output();
                    }
                    break;
                case 4:
                    int maXoa;
                    System.out.print("Nhap ma nhan-vien can xoa: ");
                    maXoa=sc.nextInt();
                    NhanVien xoa=obj.xoaNV(maXoa);
                    if(xoa==null) System.out.println("Khong tim thay");
                    else{
                        System.out.println("Day la nhan-vien da bi xoa");
                        xoa.output();
                    }
                    break;
                case 5:
                    int maSua;
                    System.out.print("Nhap ma nhan-vien can sua: ");
                    maSua=sc.nextInt();
                    obj.suaNV(maSua);
                    break;
                case 6:
                    obj.sapXep();
                    obj.xuatDSNV();
            }
        }while(choice>=1 && choice <=6);
    }
}
