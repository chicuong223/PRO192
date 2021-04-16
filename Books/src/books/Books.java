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
public class Books {

    /**
     * @param args the command line arguments
     */
    //fields
    int code;
    String title;
    
    //default constructor
    public Books(){
        code = 0;
        title="";
    }
    
    //constructor with parameter
    public Books(int code, String title){
        this.code=code;
        this.title=title;
    }
    
    //setters
    void setCode(int code){
        if(code>0)
            this.code=code;
    }
    
    void setTitle(String title){
        if(!title.isEmpty())
            this.title=title;
    }
    
    //getters
    int getCode(){
        return code;
    }
    
    String getTitle(){
        return title;
    }
    
    //output function
    void output(){
        System.out.println("Code: " +code);
        System.out.println("Title: " +title);
    }
}
