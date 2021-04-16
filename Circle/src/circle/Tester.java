/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author chiuy
 */
public class Tester {
    public static void main(String[] args) {
        Circle a = new Circle();
        System.out.println("Đường tròn thứ 1");
        a.input();
        a.output();
        
        System.out.println("Đường tròn thứ 2");
        Circle b = new Circle();
        b.input();
        b.output();
        
        a.displayrelationship(b);
    }
}
