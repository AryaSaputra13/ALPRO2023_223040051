package Repetition;

import java.util.Scanner;

public class While_bilAsli_per5 {
	public static void main(String[] args) {
		int i=1;
		
		Scanner sc= new Scanner (System.in);
		
		while (i <= 10) {
			if (i % 5== 0)
			System.out.println(i);
			else
			System.out.println(i+" ");
			i=i+1;
		}
		System.out.println("Selesai");
	}
}
