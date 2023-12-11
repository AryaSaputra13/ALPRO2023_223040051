package Modular;

import java.util.Scanner;

public class Kelola_Jam {

	public static void main(String[] args) {
		Jam T= new Jam();
		
		Scanner sc= new Scanner (System.in);
		
		// TODO Auto-generated method stub
		System.out.println("Jam= ");T.h=sc.nextInt();
		System.out.println("Menit= ");T.m=sc.nextInt();
		System.out.println("Detik= ");T.s=sc.nextInt();

		System.out.println("Waktu = "+T.h+":"+T.m+":"+T.s);
		
		System.out.println("Jam = ");
		do {
			T.h=sc.nextInt();
		}while (T.h < 0 || T.h >= 24);
		System.out.println("Menit = ");
		do {
			T.m=sc.nextInt();
		}while (T.m < 0 || T.m >= 60);
		System.out.println("Detik = ");
		do {
			T.h=sc.nextInt();
		}while (T.s < 0 || T.s >= 60);
		
		System.out.println("Waktu = "+T.h+":"+T.m+":"+T.s);
	}

}