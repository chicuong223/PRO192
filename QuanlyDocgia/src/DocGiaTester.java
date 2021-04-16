
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chiuy
 */
public class DocGiaTester {
    public static void main(String[] args) {
        //Độc giả bình thường
        //dung scanner de nhap input
        Scanner sc=new Scanner(System.in);
        int ma;
        String ten;
        System.out.print("Nhập mã: ");
        ma=sc.nextInt();
        System.out.print("Nhập tên: ");
        sc=new Scanner(System.in); //clear buffer
        ten=sc.nextLine();
        DocGia dg=new DocGia(ma, ten);
        dg.output();
        //Độc giả VIP
        int maVIP;
        String tenVIP;
        int tientv;
        System.out.print("Nhập mã VIP: ");
        maVIP=sc.nextInt();
        System.out.print("Nhập tên VIP: ");
        sc=new Scanner(System.in);
        tenVIP=sc.nextLine();
        System.out.print("Nhập tiền thành viên: ");
        tientv=sc.nextInt();
        DocGiaVIP dgv=new DocGiaVIP(maVIP, tenVIP, tientv);
        dgv.output();
        //Độc giả VIP 2
        DocGia dg3=new DocGiaVIP(100, "Linh", 100000);  //Biến con trỏ to (cha) có thể chứa địa chỉ của biến nhỏ hơn (con)
        if (dg3 instanceof DocGiaVIP) //instanceof = is a
        //if(dg3 instanceof DocGia) vẫn ra
             ((DocGiaVIP)dg3).output();
        //Độc giả SVIP
       dg3=new DocGiaSVIP(200, "Lan", 0.1f);
       if (dg3 instanceof DocGiaSVIP)
     //if(dg3 instanceof DocGia) vẫn ra vì DocGia là cha của DocGiaSVIP
            ((DocGiaSVIP)dg3).output();
    }
}
