/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopmanagement;

/**
 *
 * @author chiuy
 */
public class Laptop {
    String name;
    Screen scr;
    CPU cpu;
    int price;
    int [] serial;
   
    class Screen{
        private float size;
        public Screen(){
            size = 13.3f;
        }

        public Screen(float size) {
            this.size = size;
        }

        public float getSize() {
            return size;
        }

        public void setSize(float size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return "Screen{" + "size=" + size + " inch" + '}';
        }
        
    }
    class CPU{
       private int gen;
       private String model;
        public CPU(){
            gen = 2;
            model ="";
        }

        public CPU(int gen, String model) {
            this.gen = gen;
            this.model = model;
        }

        public int getGen() {
            return gen;
        }

        public void setGen(int gen) {
            this.gen = gen;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }        

        @Override
        public String toString() {
            return "CPU{" + "gen=" + gen + ", model=" + model + '}';
        }
        
    }
    public Laptop(){
        name = "";
        scr = new Screen();
        cpu = new CPU();
        price = 0;
        serial = new int[9];
    }

    public Laptop(String name, int price, int[] serial, float size, int gen, String model) {
        this.name = name;
        this.price = price;
        this.serial = serial;
        this.scr = new Screen(size);
        this.cpu = new CPU(gen, model);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int[] getSerial() {
        return serial;
    }

    public void setSerial(int[] serial) {
        this.serial = serial;
    }

    String isHighPrice(int price){
        if(price>2000) return "high price";
        return "normal price";
    }
    boolean checkSerial(int [] serial){
        if (serial[6] == 9) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Laptop{" + "name=" + name + ", scr=" + scr + ", cpu=" + cpu + ", price=$" + price + ", serial=" + serial[6] + serial[7] + serial [8] + '}';
    }
    
}
