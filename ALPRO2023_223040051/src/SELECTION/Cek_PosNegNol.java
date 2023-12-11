package SELECTION;

import java.util.Scanner;

public class Cek_PosNegNol {
	public static void main(String[] args) {
		int bilangan;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Masukkan bilangan = ");
		bilangan=sc.nextInt();
			if (bilangan > 0) 
				System.out.println("Bil.Positif");
			else if (bilangan < 0)
				System.out.println("Bil.Negatif");
			else 
				System.out.println("Bil.Nol");
			
	}
}
