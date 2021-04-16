package A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Movie {
	private String title;
	private ArrayList<Star> list;
	private Scanner sc;
	public Movie() {
		title="";
		list = new ArrayList<Star>();
	}
	
	public void input() {
		String name;
		String gender;
		Star x=new Star();
		System.out.print("title: ");
		sc = new Scanner(System.in);
		title=sc.nextLine();
		System.out.println("5 stars");
		for(int i=0; i<5; i++) {
			do {
				System.out.print("name: ");
				sc=new Scanner(System.in);
				name=sc.nextLine();
				if(Star.nameValidation(name)==false) System.out.println("name can't be empty");
			}
			while(Star.nameValidation(name)==false);
			do {
				System.out.print("gender: ");
				sc=new Scanner(System.in);
				gender=sc.nextLine();
				if(Star.genderValidation(gender)==false) System.out.println("invalid gender");
			}
			while(Star.genderValidation(gender)==false);
			x=new Star(name, gender);
			list.add(x);
		}
}
	public void output() {
		System.out.println("movie: " +title);
		System.out.println("");
		System.out.println("stars\n");
		for (Star star : list) {
			System.out.println("name: " +star.getName());
			System.out.println("gender: " + star.getGender());
			System.out.println("");
		}
	}
	public void sortByName() {
		Collections.sort(list, Star.byName);
	}

}
