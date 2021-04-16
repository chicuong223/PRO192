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
public class Circle extends Shape{
       private double radius;
       public Circle(){
            super();
            radius = 1.0;
        }
         public Circle(double radius){
            this.radius=radius;
        }
        public Circle(String colour, boolean filled, double radius){
            super(colour, filled);
            this.radius = radius;
        }
       
        double getRadius(){
            return radius;
        }
        void setRadius(double radius){
            if(radius>0)
                this.radius = radius;
        }
        double getArea(){
            return radius*radius*3.14;
        }
        double getPerimetre(){
            return 2*radius*3.14;
        }

    @Override
    public String toString() {
        return super.toString() + ", Radius = " + radius + ", Perimetre: " + getPerimetre() + ", Area: " + getArea() + '}';//To change body of generated methods, choose Tools | Templates.
    }
}
