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
public class Food extends Products{
    //fields
    int mday;
    int mmonth;
    int myear;
    int eday;
    int emonth;
    int eyear;
    //standard constructor
    public Food(){
        super();
        mday = 0;
        mmonth = 0;
        myear = 0;
    }
    //constructor with parameters
   public Food(int code, String name, String make, int price, int mday, int mmonth, int myear, int eday, int emonth, int eyear){
       super(code, name, make, price);
       this.mday = mday;
       this.mmonth = mmonth;
       this.myear = myear;
       this.eday = eday;
       this.emonth = emonth;
       this.eyear = eyear;
   }
   //setters
   void setMday(int mday){
       if(mday>0)
           this.mday = mday;
   }
   void setMmonth(int mmonth){
       if(mmonth>0)
           this.mmonth = mmonth;
   }
   void setMyear(int myear){
       if(myear>0)
           this.myear = myear;
   }
   void setEday(int eday){
       if(eday>0)
           this.eday = eday;
   }
   void setEmonth(int emonth){
       if(emonth>0)
           this.emonth = emonth;
   }
   void setEyear(int eyear){
       if(eyear>0)
           this.eyear = eyear;
   }
   //getters
   int getMday(){
       return mday;
   }
   int getMmonth(){
       return mmonth;
   }
   int getMyear(){
       return myear;
   }
    int getEday(){
       return eday;
   }
   int getEmonth(){
       return emonth;
   }
   int getEyear(){
       return eyear;
   }
   //methods
   void outputF(){
       output();
       System.out.println("Date of Manufacture: " + mday + "/" + mmonth +"/" + myear);
       System.out.println("Date of Expiration: " + eday + "/" + emonth + "/" + eyear + "\n");
   }
}