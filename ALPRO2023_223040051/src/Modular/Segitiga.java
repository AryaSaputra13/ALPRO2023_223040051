package Modular;

import java.util.Scanner;

public class Segitiga {
//	Prosedur
		static double HitungLuasSegitiga2() {
			double alas, tinggi, luas;
			Scanner sc= new Scanner (System.in);
			
			System.out.println("Alas = ");alas=sc.nextDouble();
			System.out.println("Tinggi = ");tinggi=sc.nextDouble();
			luas=  (double) 1/2 * alas * tinggi;
			return luas;
		}
	
		static void HitungLuasSegitiga() {
			double alas, tinggi, luas;
			Scanner sc= new Scanner (System.in);
			
			System.out.println("Alas = ");alas=sc.nextDouble();
			System.out.println("Tinggi = ");tinggi=sc.nextDouble();
			luas=  (double) 1/2 * alas * tinggi;
			System.out.println(": Segitiga");
			System.out.println("Luas= "+luas);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HitungLuasSegitiga();
		Double L=HitungLuasSegitiga2();
		System.out.println(": Segitiga2");
		System.out.println("Luas= "+L);

	}

}
