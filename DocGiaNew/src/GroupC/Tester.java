/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupC;

import GroupA.DocGia;
import GroupA.DocGiaVIP;
import GroupB.DocGiaSVIP;

/**
 *
 * @author chiuy
 */
public class Tester {
    public static void main(String[] args) {
        //tao Doc Gia 
        DocGia dg = new DocGia("1250686", "Vito Scaletta", "15E, Chinatown, Empire Bay", "0907546789", 150);
        //dg.xuat(); ko su dung duoc vi ham xuat() la default
        System.out.println("Thong tin doc gia ");
        System.out.println("\nDoc gia thuong");
        System.out.println("Ma: " + dg.getMa());
        System.out.println("Ten: " + dg.getTen());
        System.out.println("Dia chi: " + dg.getDiachi());
        
        //tao Doc Gia VIP
        DocGia dgv = new DocGiaVIP(50000, "VIP150676", "Carl Johnson", "Grove Street, Los Santos", "+176859574");
        System.out.println("\nDoc gia VIP");
        ((DocGiaVIP)dgv).xuatVIP();
        
        //tao DocGia SVIP
        DocGia dgsv = new DocGiaSVIP("tomver@gmail.com", "Vercetti Estate, Stafish Island, Vice City", "0987564749");
        System.out.println("\nDoc gia SVIP");
        ((DocGiaSVIP)dgsv).xuatSVIP();
    }
}
