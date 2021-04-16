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
public class Products {

    /**
     * @param args the command line arguments
     */
  //fields
    private int code;
    String name;
    String make;
    int price;
    
    //standard constructor
    public Products(){
        code = 0;
        name = "";
        make = "";
        price = 0;
    }
    
    //constructor with parameters
    public Products(int code, String name, String make, int price){
        this.code = code;
        this.name = name;
        this.make = make;
        this.price = price;
    }
    
    //setters
    void setCode(int code){
        if(code>0)
            this.code = code;
    }
    void setName(String name){
        if(!name.equals(""))
            this.name = name;
    }
    void setMake(String make){
        if(!make.isEmpty())
            this.make = make;
    }
    void setPrice(int price){
        if (price>0)
            this.price = price;
    }
    //getters
    int getCode(){
        return code;
    }
    
    String getName(){
        return name;
    }
    
    String getMake(){
        return make;
    }
    
    int price(){
        return price;
    }
    
    //methods
    void output(){
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Make: " + make);
        System.out.println("Price: " + price + " VND");
    }
}
