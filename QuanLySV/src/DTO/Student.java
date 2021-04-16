/**
 * 
 */
package DTO;

/**
 * @author chiuy
 *
 */
public class Student {
	private String id;
	private String name;
	private String email;
	private double PE;
	private double FE;
	public Student(String id, String name, String email, double pE, double fE) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		PE = pE;
		FE = fE;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + ", " + name +", " + email + ", " + PE + ", " + FE;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getPE() {
		return PE;
	}


	public void setPE(double pE) {
		PE = pE;
	}


	public double getFE() {
		return FE;
	}


	public void setFE(double fE) {
		FE = fE;
	}
	
}
