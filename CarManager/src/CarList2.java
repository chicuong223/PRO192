import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class CarList2 {
	TreeSet <Car> list;
	private Scanner sc;
	public CarList2() {
		list = new TreeSet<Car>();
	}
	public void addCar(Car x) {
		list.add(x);  //for this function to run properly, Car class must have "compareTo" function
	}
	public void displayAll() {
		//LNR
		/*
		//method 1
		for (Car car : list) {
			System.out.println(car);
		}
		*/
		
		//method 2
		/*
		Iterator<Car> tmp=list.iterator(); //the lowest id
		while(tmp.hasNext()) {
			Car x=tmp.next();
			System.out.println(x);
		}
		*/
		//RNL
		Iterator<Car> tmp2=list.descendingIterator();
		while(tmp2.hasNext()) {
			Car x=tmp2.next();
			System.out.println(x);
		}
	}
	
	public Car findCar(int id) {
		for (Car car : list) {
			if(car.getId()==id)
				return car;
		}
		return null;
	}
	
	public void deleteCar(int id) {
		Car o=findCar(id);
		list.remove(o);
	}
	
	public void setCar(int id) {
		Car c=findCar(id);
		sc = new Scanner(System.in);
		System.out.println("enter new name: ");
		c.setName(sc.nextLine());
	}
	
}
