package packageA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
	String email;
	String password;
	
	public Account() {
		email="";
		password="";
	}

	public Account(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public static boolean passwordValidation(String password) {
		String pat="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,32}$";
		Pattern pattern = Pattern.compile(pat);
		Matcher mat=pattern.matcher(password);
		return mat.matches();
	}
	
	public static boolean emailValidation(String email) {
		String pat = "^[a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
		Pattern pattern = Pattern.compile(pat);
		Matcher mat=pattern.matcher(email);
		return mat.matches();
	}

	@Override
	public String toString() {
		return "Account [email=" + email + ", password=" + password + "]";
	}
}
