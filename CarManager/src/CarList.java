import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CarList {
	List<Car> list;
	private Scanner sc;
	
	public CarList() {
		list = new ArrayList<Car>();
	}
	
	public void addCar(Car x) {
		list.add(x);
	}
	
	public void displayAll() {
		//method 1
		/*for(int i=0; i<list.size(); i++ ) {
			System.out.println(list.get(i));
		}*/
		//method 2
		if(list.size()==0) System.out.println("No data");
		for (Car car : list) {
			System.out.println(car);
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
	
	//sort in ascending order by id
	public void sortId() {
		Collections.sort(list);
	}
	
	//sort in ascending order by name
	public void sortName() {
		Collections.sort(list, Car.byName);
	}
	
}
