package Tugas;

import java.util.Scanner;

public class Tugas3 {
	int h, m, s;
	void ReadClock() {
		
	Scanner sc= new Scanner (System.in);
		
	System.out.println("Jam= ");h=sc.nextInt();
	System.out.println("Menit= ");m=sc.nextInt();
	System.out.println("Detik= ");s=sc.nextInt();
	}
	
	void ReadClockWithValidation() {
		
	Scanner sc= new Scanner (System.in);
		
	System.out.println("Jam = ");
	do {
		h=sc.nextInt();
	}while (h < 0 || h >= 24);
	System.out.println("Menit = ");
	do {
		m=sc.nextInt();
	}while (m < 0 || m >= 60);
	System.out.println("Detik = ");
	do {
		h=sc.nextInt();
	}while (s < 0 || s >= 60);
	}
	
	public static void main(String[] args) {
		Jam T= new Jam();
		
		
		// TODO Auto-generated method stub
		T.h
	}

}
