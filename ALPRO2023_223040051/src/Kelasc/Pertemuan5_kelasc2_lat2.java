package Kelasc;

import java.util.Scanner;

public class Pertemuan5_kelasc2_lat2 {
	public static void main (String[] args) {
		int nilai;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Masukkan nilai = ");
		nilai = sc.nextInt();
		
		if ((nilai >= 60) && (nilai <= 100)) {
			System.out.println("Anda memenuhi syarat");
		 }else if((nilai >= 20) && (nilai <= 59)){
			 System.out.println("lol");
		 }else if((nilai >= 5)&&(nilai <= 19)){
			 System.out.println("lumayan lol");
		 }else {
			 System.out.println("*****!!!!!");
		 }
		
	}

}
