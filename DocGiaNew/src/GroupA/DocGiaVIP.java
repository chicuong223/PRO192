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
public class DocGiaVIP extends DocGia{
    int tienTV;

    public DocGiaVIP() {
        ma = "";
        ten = "";
        diachi = "";
        dienthoai = "";
        tienTV = 0;
    }

    public DocGiaVIP(int tienTV, String ma, String ten, String diachi, String dienthoai) {
        super(ma, ten, diachi, dienthoai, 0);
        this.tienTV = tienTV;
    }

    public DocGiaVIP(int tienTV) {
        this.tienTV = tienTV;
    }

    public int getTienTV() {
        return tienTV;
    }

    public void setTienTV(int tienTV) {
        this.tienTV = tienTV;
    }
    
    public void xuatVIP(){
        xuat();
        System.out.println("Tien thanh vien: " + tienTV);
    }
}
