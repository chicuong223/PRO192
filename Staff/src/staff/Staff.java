/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;



import java.util.Scanner;
import Validation.MyValidation;

/**
 *
 * @author chiuy
 */
public class Staff {
    String id;
    String name;
    String email;
    String phone;
    String password;
    String DoB;
    int salary;
    
    public Staff(){
        id = "";
        name = "";
        email = "";
        phone = "";
        password = "";
        DoB = "";
        salary = 0;
    }

    public Staff(String id, String name, String email, String phone, String password, String DoB, int salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.DoB = DoB;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + email + " - " + phone + " - " + password + " - " + DoB + " - " + salary;
    }
    
    
    
    public void Input() {
        Scanner sc = new Scanner(System.in);
        String pattern;
        final String passpat = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,12})";
        final String phonepat = "^[0-9]{9,12}$";
        final String datePattern="^[0-9]{2}/[0-9]{2}/[0-9]{4}$";
        int day, month, year;
        System.out.print("Enter id pattern: ");
        pattern = sc.nextLine();
        do{
            System.out.print("Id: ");
            id = sc.nextLine();
            if (MyValidation.isValidString(id, pattern) == false){
                System.out.println("Invalid Id");
            }
        }while(MyValidation.isValidString(id, pattern) == false);
        
        sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine();
        
        sc = new Scanner(System.in);
        do{
            System.out.print("Email: ");
            email = sc.nextLine();
            if(MyValidation.isValidEmail(email)==false) System.out.println("Invalid email");
        }while(MyValidation.isValidEmail(email)==false);
        do{
            do{
                sc = new Scanner(System.in);
                System.out.print("Date of Birth (dd/mm/yyyy): ");
                DoB = sc.nextLine();
            }while(MyValidation.isValidString(DoB, datePattern)==false);
            day = Integer.parseInt(DoB.split("/") [0]);
            month = Integer.parseInt(DoB.split("/") [1]);
            year = Integer.parseInt(DoB.split("/") [2]);
            if(!MyValidation.isValidDate(year, month, day)) System.out.println("Invalid date");
        }while(!MyValidation.isValidDate(year, month, day));
        sc = new Scanner(System.in);
        do{
            System.out.print("Phone: ");
            phone = sc.nextLine();
            if(MyValidation.isValidPhoneNumber(phone) == false || MyValidation.isValidString(phone, phonepat)==false) System.out.println("Invalid phone number");
        }while(MyValidation.isValidPhoneNumber(phone) == false || MyValidation.isValidString(phone, phonepat)==false);
        
        System.out.print("Salary: ");
        salary = sc.nextInt();
        do{
            System.out.print("Password: ");
            sc = new Scanner (System.in);
            password = sc.nextLine();
            if(MyValidation.isValidString(password, passpat)==false) System.out.println("Invalid password");
        }while (MyValidation.isValidString(password, passpat)==false);
    }
}
