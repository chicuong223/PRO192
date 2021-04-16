/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chiuy
 */
public class DocGiaSVIP extends DocGia{
    float discount;
    
    //default constructor
    public DocGiaSVIP(){
    ma=0;
    ten="";
    discount=0;
    }
    
    //constructor with parametre
    public DocGiaSVIP(int ma, String ten, float discount){
        this.ma=ma;
        this.ten=ten;
        this.discount=discount;
    }
    
    //output function
    /*void outputSVIP(){
        output();
        System.out.println("Discount: " +discount);
    }*/

    @Override
    void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Discount: " + discount);
    }
    
}
