package SELECTION;

import java.util.Scanner;

public class Cek_Pass {
	public static void main(String[] args) {
		String user, pass;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Username: ");
		user = sc.next();
		
		System.out.println("Password: ");
		pass = sc.next();
		

		if ((user.equals("admin")) && (pass.equals("Super_admin")) )
			System.out.println("Confimed "+ user);
		else
			System.out.println("Siapa???");
		
	}
}
