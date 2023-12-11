package PEMULA;

import java.util.Scanner;

public class OperasiLogicString {
	public static void main (String[] args) {
		String Password="s123", S="";
		boolean hasil;

		System.out.println("Password = "+ Password);
		System.out.println("S0 = "+ S);
		
		hasil= Password.equals("s123");
		System.out.println("a==b equals = " + hasil);
		hasil= Password.equalsIgnoreCase("s123");
		System.out.println("a==b equalsIgnoreCase = " + hasil);
		int ulang=2;
		hasil= Password.equals("s123") && (ulang<3);
		System.out.println("cek login 2 " + hasil);
		
//		H=a;
//		System.out.println("'a' = "+ H);// ASCII code 'a'
//		H=b;
//		System.out.println("'b' = "+ H); // 'b'
//		H=A;
//		System.out.println(" 'A' = "+ H);// 'A'
//		System.out.println(" a+b = "+ (a+b));// +
		
//		int H1=a, H2=b;
//		int H3= max (H1,H2);
//		System.out.println(" max (H1,H2) = "+ H3);// max
		
//		System.out.println("a+b = "+ (a+b));//+
//		System.out.println("a-b = "+ (a-b));//-
//		c= a/b;
//		System.out.println("a div b = "+ c);// div
//		c= a % b;
//		System.out.println("a mod b = "+ c);// mod
//		
//		c=Math.round(d);
//		System.out.println("round (22/7) = "+ c);// round
//		c=Math.max(a, b);
//		System.out.println("max {a, b) = "+ c);// max
//		
//		hasil= a == b;
//		System.out.println("a == b = "+ hasil);
//		hasil= a!=b;
//		System.out.println("a!=b = "+ hasil);
//		hasil= a < b;
//		System.out.println("a < b = "+ hasil);
//		hasil= a <= b;
//		System.out.println("a <= b = "+ hasil);
//		hasil= a > b;
//		System.out.println("a > b = "+ hasil);
//		hasil= a >=b ;
//		System.out.println("a => b = "+ hasil);
//		
//		hasil= a+10 >= b;
//		System.out.println("a+10 >= b = "+ hasil);
//		hasil= a+10 >= b&&a < 100;
//		System.out.println("a+10 >= b && a<100 "+ hasil);
				
	}
}
