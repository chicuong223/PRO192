/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

/**
 *
 * @author chiuy
 */
public class ScienceBook extends Books{
    //fields
    String type;
    
    //default constructor
    public ScienceBook(){
        super();
        type="";
    }
    
    //constructor with parameter
    public ScienceBook(int code, String title, String type){
        super(code, title);
        this.type=type;
    }
    
    //setters
    void setType(String type){
        if(!type.isEmpty())
            this.type=type;
    }
    
    //getters
    String getType(){
        return type;
    }
    
    //output function
    void outputScienceBook(){
        output();
        System.out.println("Type: " +type);
    }
}
