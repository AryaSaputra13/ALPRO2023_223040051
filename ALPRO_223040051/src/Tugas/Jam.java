package Tugas;

import java.util.Scanner;

public class Jam {
int h, m, s;
	
	Scanner sc = new Scanner( System.in );
	
	Jam J = new Jam();
	
	void readclock() {
		do {
			System.out.print("Jam: ");
			J.h = sc.nextInt();
		} while(h < 0 || h > 23);
		do {
			System.out.print("Menit: ");
			J.m = sc.nextInt();
		} while(m < 0 || h > 59);	
		do {	
			System.out.print("Detik: ");
			J.s = sc.nextInt();
		} while(s < 0 || s > 59);
		
	}
	
	void writeclock() {
		System.out.println(J.h+":"+J.m+":"+J.s);
	}
	
	
	void say() {
		if (J.h >= 0 && J.h <= 5)
			System.out.println("Selamat Subuh");
		else
			if (J.h >= 6 && J.h <= 10)
				System.out.println("Selamat Pagi");
			else
				if (J.h >= 11 && J.h <= 15)
					System.out.println("Selamat Siang");
				else
					if (J.h >= 16 && J.h <= 18)
						System.out.println("Selamat Sore");
					else
						if (J.h >= 17 && J.h <= 23)
							System.out.println("Selamat Malam");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jam J = new Jam();
		
		J.readclock();
		J.writeclock();
		J.say();
	}

}
