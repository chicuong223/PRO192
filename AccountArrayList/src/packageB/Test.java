package packageB;

import java.util.Scanner;

import packageA.Account;
import packageA.AccountList;

public class Test {
	private static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		AccountList obj=new AccountList();
		sc=new Scanner(System.in);
		do {
			System.out.println("1. Add a new account");
			System.out.println("2. Login");
			System.out.println("3. Display all accounts");
			System.out.println("4. Exit");
			System.out.println("Choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				String email, password;
				do {
					System.out.println("Enter email: ");
					sc=new Scanner(System.in);
					email = sc.nextLine();
				}while(Account.emailValidation(email)==false);
				do {
					System.out.println("Enter password: ");
					sc=new Scanner(System.in);
					password = sc.nextLine();
				}while(Account.passwordValidation(password)==false);
				Account acc=new Account(email, password);
				obj.addAccount(acc);
				break;
			case 2:
				String emaillog,passwordlog;
				System.out.println("Enter email: ");
				sc=new Scanner(System.in);
				emaillog=sc.nextLine();
				System.out.println("Enter password: ");
				sc=new Scanner(System.in);
				passwordlog=sc.nextLine();
				int loginIndex = obj.login(emaillog, passwordlog);
				if(loginIndex==-1) {
					System.out.println("Account or password is incorrect");
					break;
				}
				System.out.println("Do you want to change password (Y/N): ");
				sc=new Scanner(System.in);
				String chpas=sc.nextLine();
				String a = chpas.toUpperCase();
				if(a.equals("Y")) {
					String newPassword;
					do {
					System.out.println("Enter new password");
					newPassword=sc.nextLine();
					obj.updatePassword(newPassword, loginIndex);
					}while(Account.passwordValidation(newPassword)==false);
					System.out.println("Successful");
				}
				break;
			case 3:
				obj.display();
				break;
			}
		}
		while(choice>=1 && choice<4);
	}

}
