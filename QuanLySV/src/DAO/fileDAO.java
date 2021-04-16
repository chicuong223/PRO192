/**
 * 
 */
package DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import DTO.Student;

/**
 * @author chiuy
 *
 */
public class fileDAO {
	//read the text file
	//return list of Student
	public static ArrayList<Student> loadStudents(String filename){
		FileReader f = null;
		BufferedReader rf=null;
		ArrayList<Student> result = new ArrayList<>();
		try {
			f = new FileReader(filename);
			rf = new BufferedReader(f);
			while(rf.ready()) //while EOF is not reached
			{
				String s=rf.readLine();
				String [] arr=s.split(",");
				if(arr.length==5)  //student has 5 fields
				{
					Student tmp=new Student(arr[0], arr[1], arr[2], Double.parseDouble(arr[3]),Double.parseDouble(arr[4]));
					result.add(tmp);
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (f!=null) f.close();
				if (rf!=null) rf.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return result;
	}
	public static void writeStudents(ArrayList<Student> list, String filename) {
		PrintWriter w=null;	//create a buffer, link this buffer to a file in hard disk
		if(list==null || list.isEmpty()) return;
		try {
			w=new PrintWriter(filename);		//create a new file
			for (Student student : list) {
				//String s=student.toString();
				//w.println(s);
				w.println(student); //write a string (student) to buffer
				w.flush();  //push the string to file
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				if(w!=null) w.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
