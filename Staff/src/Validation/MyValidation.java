/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author chiuy
 */
public class MyValidation {
    public static boolean isValidDate(int year, int month, int day){
        int maxd=31;
        if (day<1 || day>31 || month<1 || month>12) return false;
        if(month==4 || month==6 || month==9 || month==11) maxd=30;
        if(month==2){
            if(year%400 == 0 || (year%4 == 0 && year%100 != 0)) maxd=29;
            else maxd=28;
        }
        return day<=maxd;
    }
    
    public static boolean isValidPhoneNumber(String s){
        if (s.length()>=9 && s.length()<=12) return true;
        return false;
    }
    
    public static boolean isValidEmail(String s){
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
    
    public static boolean isValidString(String s, String pattern){
        Pattern r = Pattern.compile(pattern);
        Matcher match = r.matcher(s);
        return match.matches();
    }
    
}
