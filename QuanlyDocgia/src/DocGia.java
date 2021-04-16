/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chiuy
 */
public class DocGia {
    
        
        int ma;
        String ten;
        //constructor
        public DocGia(){    //standard constructor
            ma=0;
            ten="";
        }
        public DocGia(int ma, String ten){      //constructor with parameter
            this.ma=ma;
            this.ten=ten;
        }
        //getter
        int getMa(){
            return ma;
        }
        String getTen(){
            return ten;
        }
        //setter
        void setTen(String ten){
            if(!ten.isEmpty())
                this.ten=ten;
        }
        void setMa(int ma){
            if(ma>0)
                this.ma=ma;
        }
        //methods
        void output(){
            System.out.println("Ma: " +ma);
            System.out.println("Ten: " +ten);
        }

    @Override
    public String toString() {
        return "DocGia{" + "ma=" + ma + ", ten=" + ten + '}';
    }
        
}
