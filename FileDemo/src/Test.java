import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*byte[] data=FileDAO.readFile("C:\\Users\\chiuy\\Pictures\\Saved Pictures\\102-512.png");
		FileDAO.writeFile(data, "copy.jpg");*/
		
		/*FileDAO.writeData(3, 'A', "filename.txt");
		FileDAO.readData("filename.txt");*/
		
		/*Dog gaugau = new Dog(100, "a");
		FileDAO.writeUserObject(gaugau, "Dog.txt");
		FileDAO.readUserObject("Dog.txt");*/
		
		ArrayList<Dog> list=new ArrayList<Dog>();
		list.add(new Dog(1, "a"));
		list.add(new Dog(2,"b"));
		FileDAO.writeDogs(list, "DogList.dat");
		ArrayList<Dog> result=FileDAO.readDogs("DogList.dat");
		System.out.println(result);
	}

}
