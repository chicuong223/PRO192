/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

/**
 *
 * @author chiuy
 */
public class Electric extends Products{
    //fields
    int guaranty;
    int voltage;
    int power;
    
    //standard constructor
    public Electric(){
        super();
        guaranty = 0;
        voltage = 0;
        power = 0;
    }
    
    //constructor with parameters
    public Electric(int code, String name, String make, int price, int guaranty, int voltage, int power){
        super(code, name, make, price);
        this.guaranty = guaranty;
        this.voltage = voltage;
        this.power = power;
    }
    
    //setters
    void setGuaranty(int guaranty){
        if(guaranty>0)
            this.guaranty = guaranty;
    }
    void setVoltage(int voltage){
        if(voltage>0)
            this.voltage = voltage;
    }
    void setPower(int power){
        if(power>0)
            this.power = power;
    }
    
    //getters
    int getGuaranty(){
        return guaranty;
    }
    int getVoltage(){
        return voltage;
    }
    int getPower(){
        return power;
    }
    
    //methods
    void outputE(){
        output();
        System.out.println("Guaranty: " + guaranty + " year(s)");
        System.out.println("Voltage: " + voltage + " volt(s)");
        System.out.println("Power: " + power + " watt(s)\n");
    }
}