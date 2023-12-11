package SELECTION;

import java.util.Scanner;

public class Cek_wujudAir {
	public static void main(String[] args) {
		int suhu;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Masukkan Suhu = ");
		suhu=sc.nextInt();
			if (suhu <= 0) 
				System.out.println("Padat");
			else if (suhu >= 120)
					System.out.println("Gas");
				 else 
					System.out.println("Cair");
			
			
	}
}
