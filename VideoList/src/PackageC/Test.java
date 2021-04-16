package PackageC;

import java.util.Scanner;

import PackageA.Video;
import PackageB.VideoList;

public class Test {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideoList obj=new VideoList();
		int choice=0;
		sc = new Scanner(System.in);
		do {
			System.out.println("PROGRAMME TO MANAGE VIDEOS");
			System.out.println("1. Add a video");
			System.out.println("2. Search a video by title");
			System.out.println("3. Exit");
			System.out.print("Your choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				Video x = new Video();
				sc = new Scanner(System.in);
				int year;
				String title;
				System.out.print("Title: ");
				title=sc.nextLine();
				do {
					System.out.print("Year: ");
					year=sc.nextInt();
					if(Video.yearValidation(year)==false) System.out.println("Invalid year");
				}while(Video.yearValidation(year)==false);
				x=new Video(title, year);
				obj.addVideo(x);
				break;
			case 2:
				String mtitle;
				System.out.print("Title: ");
				sc=new Scanner(System.in);
				mtitle=sc.nextLine();
				Video found =obj.searchByTile(mtitle);
				if(found==null) System.out.println("Not found");
				else {
					System.out.println("Title: " +found.getTitle());
					System.out.println("Year: " +found.getYear());
				}
				break;
			default: 
				System.out.println("Goodbye!");
				break;
			}
		}while(choice>=1 && choice<3);
	}

}
