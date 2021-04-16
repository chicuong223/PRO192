import java.util.Comparator;

public class Car implements Comparable<Car>{
		private int id;
		private String name;
		
		public Car(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return "Car [id=" + id + ", name=" + name + "]";
		}
		
		@Override
		public int compareTo(Car o) {
			/* id: first car, 	o.getId(): second car*/
			if(id>o.getId())
				return 1;
			else if(id<o.getId())
				return -1;
			return 0;
		}
		
		//create a class to make an comparator interface
		//compare 2 cars' names
		public static Comparator<Car> byName=new Comparator<Car>() {
			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				if(o1.getName().compareTo(o2.getName())>0) return 1;
				else if(o1.getName().compareTo(o2.getName())<0) return -1;
				return 0;
			}
			
		};
}
