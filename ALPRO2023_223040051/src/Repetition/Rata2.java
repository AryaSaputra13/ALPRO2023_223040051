package Repetition;

import java.util.Scanner;

public class Rata2 {
	public static void main(String[] args) {
		int i, jmlhMHS, K, Donasi;
		i=1;
		K=0;
		float R=0;
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Jumlah Mahasiswa: "); jmlhMHS=sc.nextInt();
		while (i <= jmlhMHS) {
			System.out.println("Besar donasi anda"+i+": "); Donasi=sc.nextInt();
			K= K + Donasi;
			i=i+1;
		}
		System.out.println("Total Donasi "+K);
		if (jmlhMHS > 0)
			R=K/i;
		System.out.println("rata2"+R);
	}
}
