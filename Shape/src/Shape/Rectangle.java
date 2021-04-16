/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 *
 * @author chiuy
 */
public class Rectangle extends Shape{
   protected double width;
   protected double length;
    public Rectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String colour, boolean filled){
        super(colour, filled);
        this.width = width;
        this.length = length;
    }
    double getWidth(){
        return width;
    }
    void setWidth(double width){
        if(width>0)
            this.width = width;
    }
    double getLength(){
        return length;
    }
    void setLength(double length){
        if(length>0)
            this.length = length;
    }
    double getArea(){
        return width*length;
    }
    double getPerimetre(){
        return 2*(width + length);
    }

    @Override
    public String toString() {
         return super.toString() + ", Length: " + length + ",Width: " + width + ", Perimetre: " + getPerimetre() + ", Area: " + getArea() + '}'; //To change body of generated methods, choose Tools | Templates.
    }
}
