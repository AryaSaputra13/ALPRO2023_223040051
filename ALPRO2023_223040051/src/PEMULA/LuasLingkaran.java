package PEMULA;

import java.util.Scanner;

public class LuasLingkaran {
	public static void main (String[] args) {
		double Phi= 3.14;
		double jari2, luas;
		
		
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Ketikan jari-jar: ");jari2=sc.nextDouble();
		luas=Phi*jari2*jari2;
		System.out.println("Luas= "+luas);
		
	}
}
