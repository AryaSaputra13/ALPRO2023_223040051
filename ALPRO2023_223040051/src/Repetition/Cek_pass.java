package Repetition;

import java.util.Scanner;

public class Cek_pass {
	public static void main(String[] args) {
		String pass;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Masukkan Password: "); pass=sc.next();
		while (!pass.contentEquals("$$$")) {
			System.out.println("Masukkan Password: "); pass=sc.next();
		}
		System.out.println("Welcome");
	}
}
