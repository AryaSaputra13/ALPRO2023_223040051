package PEMULA;

import java.util.Scanner;

public class OperasiLogicBilaganRil {
	public static void main (String[] args) {
		double a=5.0, b=7.7, c;
		boolean hasil;
		
		
		System.out.println("a+b = "+ (a+b));//+
		System.out.println("a-b = "+ (a-b));//-
		c= a/b;
		System.out.println("a div b = "+ c);// div
		c=Math.sqrt(a);
		System.out.println("akar kuadrat (a) = "+ c);// akar kuadrat (sqrt)
		
		
		hasil= a == b;
		System.out.println("a == b = "+ hasil);
		hasil= a!=b;
		System.out.println("a!=b = "+ hasil);
		hasil= a < b;
		System.out.println("a < b = "+ hasil);
		hasil= a <= b;
		System.out.println("a <= b = "+ hasil);
		hasil= a > b;
		System.out.println("a > b = "+ hasil);
		hasil= a >=b ;
		System.out.println("a => b = "+ hasil);
		
		hasil= a+10 >= b;
		System.out.println("a+10 >= b = "+ hasil);
		hasil= a+10 >= b&&a < 100;
		System.out.println("a+10 >= b && a<100 = "+ hasil);
				
	}
}
