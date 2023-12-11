package Modular;

import java.util.Scanner;

public class SegitigaDenganParameter {
//	Prosedur
		static double HitungLuasSegitiga2(double alas, double tinggi) {
			double luas;
			
			luas=  (double) 1/2 * alas * tinggi;
			return luas;
		}
	
		static void HitungLuasSegitiga(double alas, double tinggi) {
			double luas;
			Scanner sc= new Scanner (System.in);
	
			luas=  (double) 1/2 * alas * tinggi;
			System.out.println(": Segitiga");
			System.out.println("Luas= "+luas);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Alas = ");double a=sc.nextDouble();
		System.out.println("Tinggi = ");double t=sc.nextDouble();
		
		HitungLuasSegitiga(a, t);
		Double L=HitungLuasSegitiga2(a, t);
		System.out.println(": Segitiga2");
		System.out.println("Luas= "+L);

	}

}
