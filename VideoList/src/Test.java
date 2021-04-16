
public class Test {
	int x;
	public Test(int x){
		this.x=x;
	}

     public static void main(String[] args){
    	 Test[]  arrayList = new Test[10];

    	arrayList[0]=new Test(25);

    	arrayList[1]=new Test(30); 

    	 System.out.println(arrayList[2]);
    	
    }
}
