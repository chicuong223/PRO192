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
public class Ceramic extends Products{
    //fields
    String type;
    //standard constructor
    public Ceramic(){
        super();
        type = "";
    }
    //constructor with parameters
    public Ceramic(int code, String name, String make, int price, String type){
        super(code, name, make, price);
        this.type = type;
    }
    //setters
    void setType(String type){
        this.type = type;
    }
    //getters
    String getType(){
        return type;
    }
    //methods
    void outputC(){
        output();
        System.out.println("Type: " + type + "\n");
    }
}
