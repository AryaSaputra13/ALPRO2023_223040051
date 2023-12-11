package SELECTION;

import java.util.Scanner;

public class Cek_ganjilGenap {
	public static void main(String[] args) {
		int bilangan;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Masukkan bilangan = ");
		bilangan=sc.nextInt();
			if (bilangan % 2 == 1) {
				System.out.println("Ganjil");
			} else {
				System.out.println("Genap");
			}
	
	}
}
