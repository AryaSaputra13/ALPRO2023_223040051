package Repetition;

import java.util.Scanner;

public class Cek_pass_limit {
	public static void main(String[] args) {
		String pass;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Masukkan Password: "); pass=sc.next();
		int i=1;
		while ((!pass.contentEquals("$$$")) && (i < 3)) {
			System.out.println("Masukkan Password: "); pass=sc.next();
			i=i+1;
		}
		if (pass.contentEquals("$$$"))
			System.out.println("Welcome");
		else
			System.out.println("Failed");
	}
}
