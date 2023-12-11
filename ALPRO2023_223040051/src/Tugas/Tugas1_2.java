package Tugas;

import java.util.Scanner;

public class Tugas1_2 {
	public static void main(String[] args) {
		int hari;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Masukkan bilangan = ");
		hari=sc.nextInt();
			switch(hari) {
				case 1: System.out.println("Minggu"); break;
				case 2: System.out.println("Senin"); break;
				case 3: System.out.println("Selasa"); break;
				case 4: System.out.println("Rabu"); break;
				case 5: System.out.println("Kamis"); break;
				case 6: System.out.println("Jum'at"); break;
				case 7: System.out.println("Sabtu"); break;
					default : System.out.println("Bukan hari biasa");
			}
	}
}
