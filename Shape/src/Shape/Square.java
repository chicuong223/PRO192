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
public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        width = length = side;
    }
    public Square(String colour, boolean filled, double side){
            this.colour = colour;
            this.filled = filled;
            width = length = side;
    }
    double getSide(){
        return width;
    }
   void setSide(double side){
           width = length = side;
   }
    @Override
   void setWidth(double side){
           width = side;
   }
    @Override
   void setLength(double side){
           length = side;
   }

    @Override
    public String toString() {
        return "Shape{" + "Colour: " + getColour() + ", Filled: " + isFilled() +", Side: " + getLength() + ", Perimetre: " + getPerimetre() + ", Area:  " + getArea() + '}';
    }
}
