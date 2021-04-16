/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author chiuy
 */
public class MyLine {
    //check whether number is positive or negative
    static boolean checkNumber(float number){
        if (number>=0) return true;
        return false;
    }
    
    //check whether name is empty
    public static boolean checkString(String a){
        if (!a.isEmpty()) return true;
        return false;
    }
    
    //check Current Date
    public static boolean currentDate(String s){
        SimpleDateFormat df = new SimpleDateFormat("mm/dd/yyyy");   
        String result = df.format(s);
        Date d=new Date(result);
        if (d.compareTo(new Date()  /*computer's clock*/)==0) return true;
        return false;
    }
}
