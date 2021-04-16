/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupB;

import GroupA.DocGia;


/**
 *
 * @author chiuy
 */
public class DocGiaSVIP extends DocGia{
    String email;

    public DocGiaSVIP() {
        diachi = "";
        dienthoai = "";
        email = "";
    }

    public DocGiaSVIP(String email, String ma, String ten, String diachi, String dienthoai, float diemTichLuy) {
        super(ma, ten, diachi, dienthoai, diemTichLuy);
        this.email = email;
    }
    
    public DocGiaSVIP(String email, String diachi, String dienthoai) {
        super("", "", diachi, dienthoai, 0);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void xuatSVIP(){
        System.out.println("Dia chi: " + diachi);
        System.out.println("Dien thoai: " + dienthoai);
        System.out.println("Email: " + email);
    }
}
