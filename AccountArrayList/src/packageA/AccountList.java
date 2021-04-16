package packageA;

import java.util.ArrayList;
import java.util.List;

public class AccountList {
	List<Account> list;
	public AccountList() {
		list=new ArrayList<Account>();
	}
	
	public boolean addAccount(Account newAcc) {
		list.add(newAcc);
		return true;
	}
	
	public int login(String email, String password) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getEmail().equals(email) && list.get(i).getPassword().equals(password)) return i;
		}
		return -1;
	}
	
	public void updatePassword(String newPassword, int UpdateIndex) {
		for(int i=0; i<list.size(); i++) {
			Account upAcc=list.get(i);
			upAcc.setPassword(newPassword);
		}
	}
	
	public void display() {
		if(list.size()==0) System.out.println("Empty list");
		for (Account account : list) {
			System.out.println(account);
		}
	}
}
