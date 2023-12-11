package Tugas;

import java.util.Scanner;

public class Tugas1_1 {
	public static void main(String[] args) {
		double X1, X2, a, b, c, D;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Masukkan nilai a: ");
		a =sc.nextDouble();
		System.out.println("Masukkan nilai b: ");
		b =sc.nextDouble();
		System.out.println("Masukkan nilai c: ");
		c =sc.nextDouble();
		
		D =Math.pow(b, 2)-4*a*c;
		
		if (D < 0) {
			System.out.println("X1 dan X2 adalah bilangan imajiner");
		}else if (D == 0) {
			X1 = -b/(2*a);
			System.out.println("X1=X2="+X1);
		}else {
			X1 = (-b + Math.sqrt(D))/(2*a);
			X2 = (-b - Math.sqrt(D))/(2*a);
			System.out.println("X1 = "+X1);
			System.out.println("X2 = "+X2);
		}
	}
}
