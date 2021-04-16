/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonemanagement;

/**
 *
 * @author chiuy
 */
public class Phone {
    private String name;
    private String model;
    private Battery battery;
    
    class Battery{
        int capacity;
        
        public Battery(){
            capacity = 0;
        }

        public Battery(int capacity) {
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "Battery{" + "capacity=" + capacity + '}';
        }
    }
    
    public Phone(){
        name = "";
        model = "";
        battery = new Battery();
    }

    public Phone(String name, String model, int capacity) {
        this.name = name;
        this.model = model;
        this.battery = new Battery(capacity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" + "name=" + name + ", model=" + model + ", battery=" + battery + '}';
    }
    
}
