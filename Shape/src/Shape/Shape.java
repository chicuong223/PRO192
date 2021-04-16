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
public class Shape {
    //fields
    protected String colour;
    protected boolean filled;
    //contructor 1
    public Shape(){
        colour = "red";
        filled = true;
    }
    //constructor 2
    public Shape(String colour, boolean filled){
        this.colour = colour;
        this.filled = filled;
    }
    String getColour(){
        return colour;
    }
    void setColour(String colour){
        if(!colour.isEmpty())
            this.colour=colour;
    }
    boolean isFilled(){
        return filled;
    }
    void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" + "Colour: " + colour + ", Filled: " + filled + "";
    }
    
}
