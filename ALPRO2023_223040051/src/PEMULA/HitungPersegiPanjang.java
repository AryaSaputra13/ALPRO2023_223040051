package PEMULA;

import java.util.Scanner;

public class HitungPersegiPanjang {
	public static void main (String[] args) {
		int panjang, lebar, luas;
		
		
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Ketikan panjang: ");panjang=sc.nextInt();
		System.out.print("Ketikan lebar: ");lebar=sc.nextInt();
		luas=panjang*lebar;
		System.out.println("Luas= "+luas);
	}
}
