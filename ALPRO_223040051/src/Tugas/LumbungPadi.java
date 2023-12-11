package Tugas;

import java.util.Scanner;

public class LumbungPadi {
	
	public static void main (String[] args) {
		int beras, tberas, kesempatan, lama, t;
		int max=3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Jumlah Beras: "); 
		tberas = sc.nextInt();
		System.out.print("Waktu: "); 
		t = sc.nextInt();
		kesempatan = 0;
		beras = tberas;
		while((beras > 0) && (kesempatan < 10)) {
			beras = beras - max;
			kesempatan = kesempatan + 1;
		}
		lama = kesempatan * t;
		System.out.println("Ksempatan = "+kesempatan);
		System.out.println("Lama Menumbuk = "+lama);
		System.out.println("Sisa beras = "+beras);
	}
}


