/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MobilePhone;
import USB.USB;
/**
 *
 * @author chiuy
 */
public class MobilePhone {
    int price;
    USB port;
    
    public MobilePhone(){
        price = 0;
        port = new USB();
    }

    public MobilePhone(int price, int code, int capacity) {
        this.price = price;
        this.port = new USB(code, capacity);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return port + " - $" + price;
    }
    
    
}
