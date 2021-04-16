
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
public class NewTester {
    public static void main(String[] args) {
        DocGia dg = new DocGia();
        int choice;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("1. Tạo độc giả VIP");
            System.out.println("2. Tạo độc giả SVIP");
            System.out.println("3. Xuất độc giả");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:  int ma=150676;
                            String ten = "Loan";
                            int tien = 15000;
                            dg = new DocGiaVIP(ma, ten, tien);
                            break;
                case 2:  int ma2=29560;
                            String ten2 = "Hoang";
                            float discount = 0.2f;
                            dg = new DocGiaSVIP(ma2, ten2, discount);
                            break;
                case 3:  dg.output();
                            break;
                            /* if dg is DocGiaVIP: output() is of VIP
                              if dg is DocGiaSVIP: output() is of SVIP */
           }
        }while(choice>=1 && choice <=3);
       /* DocGia tmp = new DocGia();
        System.out.println(tmp.toString());
        System.out.println(tmp);*/
    }
}
