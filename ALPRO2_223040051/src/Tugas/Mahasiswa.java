package Tugas;

import java.util.Scanner;

public class Mahasiswa {
	int Nim;
	String Nama;
	double IPK;
	
	void BacaMhs(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nim: "); Nim = sc.nextInt();
		System.out.print("Nama: "); Nama = sc.next();
		System.out.print("IPK: "); IPK = sc.nextDouble();
	}
	
	void TulisMhs(){
		
		System.out.println(Nim+","+Nama+","+IPK);
	}
}
