/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupA;

/**
 *
 * @author chiuy
 */
public class DocGia {
    String ma;
    String ten;
    protected String diachi;
    protected String dienthoai;
    private float diemTichLuy;

    public DocGia(String ma, String ten, String diachi, String dienthoai, float diemTichLuy) {
        this.ma = ma;
        this.ten = ten;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.diemTichLuy = diemTichLuy;
    }
    
    public DocGia(){
        ma = "";
        ten = "";
        diachi = "";
        dienthoai = "";
        diemTichLuy = 0;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public float getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(float diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }
    
    void xuat(){
        System.out.println("Ma: " + ma);
        System.out.println("Ten: " + ten);
        System.out.println("Dia chi: " + diachi);
        System.out.println("Dien thoai: " + dienthoai);
        System.out.println("Diem tich luy: " + diemTichLuy);
    }
}
