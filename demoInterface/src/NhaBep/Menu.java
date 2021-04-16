package NhaBep;

public interface Menu {
	int dongia=50000;
	void hauNuong(); //abstract function
	void gheHap();
	
	static void trungLuoc()
	{
		System.out.println("Cho trứng vô nồi nước lạnh");
		System.out.println("Lấy đũa quay quả trứng");
		System.out.println("Cho tới khi nước nóng");
		System.out.println("Nấu trong 6 phút rồi tắt bếp");
		System.out.println("Tiếp tục ngâm trứng trong nước nóng 8 phút");
		System.out.println("Rồi vớt trứng ra cho vô nước lạnh");
		System.out.println("Bạn sẽ có trứng luộc mà lòng đào - lòng đỏ nằm giữa quả trứng ");
	}
}
