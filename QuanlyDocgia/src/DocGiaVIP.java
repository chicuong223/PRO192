/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chiuy
 */
public class DocGiaVIP extends DocGia{
    int tienThanhVien;
    //constructor
    public DocGiaVIP(){     //standard constructor
        //ma=0;
        //ten="";       cách 1: viết riêng cho con
        super();      //cách 2: gọi cha
        tienThanhVien=0;
    }
    public DocGiaVIP(int ma, String ten, int tienThanhVien){        //constructor with parameter
       // this.ma=ma;
        //this.ten=ten;
        super(ma, ten);
        this.tienThanhVien=tienThanhVien;
    }
    
    //getter, setter
    int getTienThanhVien(){
        return tienThanhVien;
    }
    
    void setTienThanhVien(int tienThanhVien){
        if(tienThanhVien>0)
            this.tienThanhVien=tienThanhVien;
    }
    //ham xuat
    /*void outputVIP(){
        output();   //call father's output function
        System.out.println("Tiền thành viên: " +tienThanhVien); 
    }*/

    @Override
    void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        /*System.out.println("Ma: " +ma);
           System.out.println("Ten: " +ten);*/
        System.out.println("Tien thanh vien: " + tienThanhVien);
    }
}
