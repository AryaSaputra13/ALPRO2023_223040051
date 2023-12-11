package Kelasc;

import java.util.Scanner;

public class Pertemuan5_kelasc {
	public static void main (String[] args) {
		String user, pass;
		
		Scanner sc= new Scanner (System.in);
		
		
		System.out.println("Username: ");
		user = sc.next();
		
		System.out.println("Password: ");
		pass = sc.next();
		

		if ((user.equalsIgnoreCase("admin")) && (pass.equalsIgnoreCase("Super_admin")) ) {
			System.out.println("Confimed "+ user);
		}else {
			System.out.println("Siapa???");
		}
		
//		System.out.println("Masukkan nilai: ");
//		nilai = sc.nextInt();
//		
//		if ((nilai >= 60) && (nilai <= 100)) {
//			System.out.println("Anda memenuhi syarat");
//		 }else if((nilai >= 20) && (nilai <= 59)){
//			 System.out.println("lol");
//		 }else if((nilai >= 5)&&(nilai <= 19)){
//			 System.out.println("lumayan lol");
//		 }else {
//			 System.out.println("*****!!!!!");
//		 }
		
	}

}
