package PEMULA;

import java.util.Scanner;

public class OperasiLogicBilangan {
	public static void main (String[] args) {
		int a=5, b=7, c;
		boolean hasil;
		
		
		System.out.println("a+b = "+ (a+b));//+
		System.out.println("a-b = "+ (a-b));//-
		c= a/b;
		System.out.println("a div b = "+ c);// div
		c= a % b;
		System.out.println("a mod b = "+ c);// mod
		float d=22/7;
		c=Math.round(d);
		System.out.println("round (22/7) = "+ c);// round
		c=Math.max(a, b);
		System.out.println("max {a, b) = "+ c);// max
		
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
		System.out.println("a+10 >= b && a<100 "+ hasil);
				
	}
}
