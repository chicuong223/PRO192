import NhaBep.DauBep;
import NhaBep.DauBepVIP;
import NhaBep.Menu;
import NhaBep.MenuExtend;
import NhaBep.MenuRung;

public class demoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu m=new DauBep();
		m.gheHap();
		m.hauNuong();
		
		MenuRung mr=new DauBep();
		mr.naihapBia();
		mr.nhimnuongMe();
		
		Menu m2 = new DauBepVIP();
		m2.gheHap();
		m2.hauNuong();
		
		MenuExtend me=new DauBep();
		me.ngheuhapThai();
	}

}
