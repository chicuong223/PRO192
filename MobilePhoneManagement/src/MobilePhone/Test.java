/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MobilePhone;
import USB.USB;
/**
 *
 * @author chiuy
 */
public class Test {
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone(1000, 111, 256);
        MobilePhone m2 = new MobilePhone(1200, 222, 128);
        System.out.println(m1);
        System.out.println(m2);
        USB.changeModel();
        System.out.println(m1);
        System.out.println(m2);
    }
}
