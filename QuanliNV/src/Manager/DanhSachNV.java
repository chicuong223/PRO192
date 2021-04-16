/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import DTO.NVketoan;
import DTO.NVtaichanh;
import DTO.NhanVien;
import java.util.Scanner;

/**
 *
 * @author chiuy
 */
public class DanhSachNV {
    final int MAX=100;
    NhanVien [] list; //mang la con tro, default null
    int n; //so nhan-vien trong list

    public DanhSachNV() {
        list=new NhanVien [MAX]; //cap-phat 100 con tro kieu NhanVien
        n=0;
    }

    public DanhSachNV(NhanVien[] list, int n) {
        this.list = list;
        this.n = n;
    }

    public NhanVien[] getList() {
        return list;
    }

    public void setList(NhanVien[] list) {
        this.list = list;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    //them 1 nhan-vien moi vo list
    //input dua vo: nhan-vien can them
    //output: true or false
    public boolean themNV(NhanVien x){
        if (list==null) return false;
        if(n>=MAX) return false;
        list[n] = x;
        n++;
        return true;
    }
    
    //xuat danh sach
    public void xuatDSNV(){
        for(int i=0; i<n; i++){
            list[i].output();
        }
    }
    
    //xuat nv tai-chanh
     public void xuatNVTC(){
        for(int i=0; i<n; i++){
            if(list[i] instanceof NVtaichanh)
                list[i].output();
        }
    }
     
     //tim NV
     //input: ma nv can tim
     //output: vi-tri trong danh sach
      public int timKiem1(int matim){
        for(int i=0; i<n; i++){
            if(list[i].getMa()==matim)
                 return i;
        }
         return -1;
    }
      
      //tim NV
      //input: ma nv can tim
      //output: dia-chi tim thay nv trong danh sach
      public NhanVien timKiem2(int matim){
          for(int i=0; i<n; i++){
            if(list[i].getMa()==matim)
            return list[i];
        }
         return null;
      }
      
      //sua NV
      //input: ma nv can sua
      //output: khong co
      public void suaNV(int maSua){
          NhanVien kq=timKiem2(maSua);
          Scanner sc=new Scanner(System.in);
          if (kq==null) return;
          System.out.print("Nhap ten: ");
          kq.setTen(sc.nextLine());
          System.out.print("Nhap luong can-ban: ");
          kq.setLuongCB(sc.nextInt());
          System.out.print("Nhap ngay lam viec: ");
          kq.setNgayLV(sc.nextInt());
          if(kq instanceof NVtaichanh){
          System.out.print("Nhap tro-cap: ");
          ((NVtaichanh) kq).setTrocap(sc.nextInt());
         }
          else if(kq instanceof NVketoan){
              System.out.print("Nhap so nam kinh-nghiem: ");
              ((NVketoan) kq).setNamKN(sc.nextInt());
          }
          kq.output();
      }
      
      //Xoa NV
      //input: ma nv can xoa
      //output: NV vua xoa
      public NhanVien xoaNV(int maXoa){
          int i=timKiem1(maXoa);
          if(i==-1) return null;
          //cat dia-chi nhan-vien can xoa
          NhanVien tmp=list[i];
          //doi cac NV ben duoi len 1 vi-tri
          for(int k=i; k<n; k++){
              list[k]=list[k+1];
              n--; //giam 1 phan-tu
          }
          return tmp;
      }
      
      //sap xep danh sach
      public void sapXep(){
          for(int i=0; i<n; i++){
              for(int j=n-1; j>i; j--){
                  if(list[j].getMa()<list[j-1].getMa()){
                      NhanVien tmp=list[j];
                      list[j]=list[j-1];
                      list[j-1]=tmp;
                  }
              }
          }
      }
}
