import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileDAO {
	//read a binary file
	//return the read binary string
	public static byte[] readFile(String filename) {
		FileInputStream f = null;
		byte[] result=null;
		try {
			f=new FileInputStream(filename);
			result = new byte[f.available()];
			f.read(result);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				if(f!=null) f.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return result;
	}
	public static void writeFile(byte[] data, String filename) {
		FileOutputStream f=null;
		try {
			f=new FileOutputStream(filename);
			f.write(data);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				if(f!=null) f.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	//write an integer, a character to the binary file
	public static void writeData(int x, char c, String filename) {
		FileOutputStream f= null;
		DataOutputStream df=null;
		try {
			f = new FileOutputStream(filename); //mot pointer link voi o cung
			df = new DataOutputStream(f); //tạo buffer dựa trên buffer của file f, ko link voi o cung
			df.writeInt(x);
			df.writeChar(c);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				if(f!=null) f.close();
				if(df!=null)  df.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	//đọc file nhị phân, ép kiểu thành int, char
	public static void readData(String filename) {
		FileInputStream f= null;
		DataInputStream df=null;
		try {
			f = new FileInputStream(filename);
			df = new DataInputStream(f); //tạo buffer dựa trên buffer của file f
			int kq1 = df.readInt();
			char kq2 = df.readChar();
			System.out.println(kq1 + ", " + kq2);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				if(f!=null) f.close();
				if(df!=null)  df.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	//hàm nầy để ghi một class Dog vô file nhị-phân
	public static void writeUserObject(Dog gaugau, String filename) {
		FileOutputStream f= null;
		ObjectOutputStream df=null;
		try {
			f = new FileOutputStream(filename);
			df = new ObjectOutputStream(f); //tạo buffer dựa trên buffer của file f
			df.writeObject(gaugau);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				if(f!=null) f.close();
				if(df!=null)  df.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	//đọc file nhị-phân rồi ép kiểu về Dog
	public static void readUserObject(String filename) {
		FileInputStream f= null;
		ObjectInputStream df=null;
		try {
			f = new FileInputStream(filename);
			df = new ObjectInputStream(f); //tạo buffer dựa trên buffer của file f
			Dog tmp= (Dog) df.readObject();
			System.out.println(tmp);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				if(f!=null) f.close();
				if(df!=null)  df.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	//write a collection of Dog into a binary file
	public static void writeDogs(ArrayList <Dog> list, String filename) {
		FileOutputStream f= null;
		ObjectOutputStream df=null;
		try {
			f = new FileOutputStream(filename);
			df = new ObjectOutputStream(f); //tạo buffer dựa trên buffer của file f
			df.writeObject(list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				if(f!=null) f.close();
				if(df!=null)  df.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	//read the binary file, return list of Dogs
	public static ArrayList<Dog> readDogs(String filename){
		FileInputStream f= null;
		ObjectInputStream df=null;
		ArrayList<Dog> list=null;
		try {
			f = new FileInputStream(filename);
			df = new ObjectInputStream(f); //tạo buffer dựa trên buffer của file f
			list = (ArrayList<Dog>) df.readObject();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				if(f!=null) f.close();
				if(df!=null)  df.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return list;
	}
}
