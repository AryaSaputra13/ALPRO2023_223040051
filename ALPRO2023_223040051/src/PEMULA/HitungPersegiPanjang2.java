package PEMULA;

import java.util.Scanner;

public class HitungPersegiPanjang2 {
	public static void main (String[] args) {
		float panjang, lebar, luas;
		
		
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Ketikan panjang: ");panjang=sc.nextFloat ();
		System.out.print("Ketikan lebar: ");lebar=sc.nextFloat();
		luas=panjang*lebar;
		System.out.println("Luas= "+luas);
	}
}
