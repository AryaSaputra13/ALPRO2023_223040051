package PEMULA;

import java.util.Scanner;

public class HelloNama {
	public static void main (String[] args) {
		String nama;
		
		
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Ketikan nama anda: ");nama=sc.next();
		System.out.println("Hello "+nama);
	}
}
