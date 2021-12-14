package timesheet;

import java.util.Scanner;

public class Testmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Timesheet App");
		System.out.println("\n1.Register\n2.Login\nEnter ur choice");
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice)
		{
		case 1:
			UserDAO userdao=new UserDAO();
			System.out.println("Enter first name:");
			String firstname=sc.nextLine();
			System.out.println("Enter last name:");
			String lastname=sc.nextLine();
			System.out.println("Enter User Name:");
			String username=sc.nextLine();
			System.out.println("Enter Password:");
			String password=sc.nextLine();
			User user=new User(firstname,lastname,username,password);
			userdao.insertuser(user);
		case 2:
			userdao=new UserDAO();
			System.out.println("User Login");
			System.out.println("Enter registered User Name:");
			System.out.println("Enter valid password:");
			User validuser=userdao.validateuser(username, password);
			break;
		}

	}

}
