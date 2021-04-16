package NhaBep;

public class DauBep implements Menu, MenuRung, MenuExtend{

	@Override
	public void hauNuong() {
		// TODO Auto-generated method stub
		System.out.println("ăn hàu sống");
		System.out.println("ngồi gần bếp than");
		System.out.println("ăn phô-mai");
	}

	@Override
	public void gheHap() {
		// TODO Auto-generated method stub
		System.out.println("uống nước ấm");
		System.out.println("ăn ít muối");
		System.out.println("nhìn hình con ghẹ");
	}

	@Override
	public void nhimnuongMe() {
		// TODO Auto-generated method stub
		System.out.println("Vô sở thú trộm nhím");
	}

	@Override
	public void naihapBia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ngheuhapThai() {
		// TODO Auto-generated method stub
		System.out.println("( ' - ' )");
	}
	
}
