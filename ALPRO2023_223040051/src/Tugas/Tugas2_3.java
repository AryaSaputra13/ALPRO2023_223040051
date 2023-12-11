package Tugas;

import java.util.Scanner;

public class Tugas2_3 {
	public static void main(String[] args) {
		int gapok = 0 , gol, jh, uh, gaji, i=1;
		
		Scanner sc= new Scanner (System.in);
		
		while (i <= 50) {
		System.out.println("Golongan: ");
		gol =sc.nextInt();
		
		if (gol == 1)
			gapok = 700000;
		else
			if (gol == 2)
				gapok = 1000000;
			else
				if (gol == 3)
					gapok = 1400000;
				else
					if (gol == 4)
						gapok = 1600000;
					else
						System.out.println("Data Tidak Valid");
		
		System.out.println("Masukkadn Jumlah Hadir: ");
		jh =sc.nextInt();
		System.out.println("Masukkan Upah Harian");
		uh =sc.nextInt();
		System.out.println("Gaji pokok: "+gapok);
		
		gaji = gapok+(jh * uh);
		System.out.println("Gaji: " +gaji);
		
		i=i+1;
		}
	}
}
