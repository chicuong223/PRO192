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
public class DetectiveBook extends Books{
    //fields
        int price;
        int year;
        
    //default constructor
        public DetectiveBook(){
            //code=0;
           // title="";
            super();
            price=0;
            year=0;
        }
        
    //constructor with parameters
        public DetectiveBook(int code, String title, int price, int year){
                super(code, title);
                this.price=price;
                this.year=year;
        }
        
    //setters
        void setPrice(int price){
            if(price>0)
                this.price=price;
        }
        
        void setYear(int year){
            if(year>0)
                this.year=year;
        }
        
    //getters
        int getPrice(){
            return price;
        }
        
        int getYear(){
            return year;
        }
        
    //output function
        void outputDetectiveBook(){
            output();
            System.out.println("Price: " + price + " VND");
            System.out.println("Year of publication: " +year);
        }
}
