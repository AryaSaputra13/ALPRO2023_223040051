package Repetition;

import java.util.Scanner;

public class While_bilCacah_genap {
	public static void main(String[] args) {
		int i=0;
		
		Scanner sc= new Scanner (System.in);
		
		while (i <= 100) {
			System.out.println(i);
			i=i+2;
		}
		System.out.println("Selesai");
	}
}
