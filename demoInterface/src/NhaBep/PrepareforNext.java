package NhaBep;

public class PrepareforNext {
	Menu m;
	int id;
	
	public PrepareforNext() {
		id=1;
		//new an interface class
		m = new Menu() { 
			
			//anonymous nested class
			
			@Override
			public void hauNuong() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void gheHap() {
				// TODO Auto-generated method stub
				System.out.println("Nghi");
			}
		};
		m.gheHap();
	}
	public static void main(String[] args) {
		PrepareforNext pr= new PrepareforNext();
	}
}
