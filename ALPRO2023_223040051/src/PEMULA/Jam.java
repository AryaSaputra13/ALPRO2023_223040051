package PEMULA;

import java.util.Scanner;

public class Jam {
	public static void main (String[] args) {
		int Jam, Menit, Detik, Total;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Ketikan Jam: ");Jam=sc.nextInt();
		System.out.print("Ketikan Menit: ");Menit=sc.nextInt();
		System.out.print("Ketikan Detik: ");Detik=sc.nextInt();
		Total=(Jam*3600)+(Menit*60)+Detik;
		System.out.println("Total= "+Total);
		
	}
}
