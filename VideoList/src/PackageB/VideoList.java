package PackageB;
import java.util.TreeSet;

import PackageA.Video;

public class VideoList {
	TreeSet<Video> list;

	public VideoList() {
		list =  new TreeSet<Video>();
	}
	
	public boolean addVideo(Video x) {
		list.add(x);
		return true;
	}
	
	public Video searchByTile(String mtitle) {
		for (Video video : list) {
			if(video.getTitle().equals(mtitle)) return video;
		}
		return null;
	}
	
	public void display() {
		for (Video video : list) {
			System.out.println("Title: " +video.getTitle());
			System.out.println("Year: " +video.getYear());
			System.out.println("");
		}
	}
}
