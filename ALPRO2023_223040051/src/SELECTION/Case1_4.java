package SELECTION;

import java.util.Scanner;

public class Case1_4 {
	public static void main(String[] args) {
		int bilangan;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Masukkan bilangan = ");
		bilangan=sc.nextInt();
			switch(bilangan) {
				case 1: System.out.println("Satu"); break;
				case 2: System.out.println("Dua"); break;
				case 3: System.out.println("Tiga"); break;
				case 4: System.out.println("Empat"); break;
					default : System.out.println("Bukan 1-4");
			}
	}
}
