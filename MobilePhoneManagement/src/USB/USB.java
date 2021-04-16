/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USB;

/**
 *
 * @author chiuy
 */
public class USB {
    int code, capacity;
    static String model;
    static{
        model = "China";
    }
    public USB(){
        code=0;
        capacity=0;
    }

    public USB(int code, int capacity) {
        this.code = code;
        this.capacity = capacity;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        USB.model = model;
    }

    @Override
    public String toString() {
        return code + " - " + capacity + "GB - "  + model;
    }
    
    public static void changeModel(){
        String s = new String("Vietnam");
        model = s;
    }
    
}
