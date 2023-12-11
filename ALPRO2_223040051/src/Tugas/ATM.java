package Tugas;

import java.util.Scanner;

public class ATM {
	int saldo = 200000;
	int tarik, setor, transfer;
	String norek, nama;
//	String Nnasabah;
	
	void Cek_Saldo() {
		System.out.println("Sisa saldo anda : Rp. " + saldo);
	}
	
	void Tarik_Uang() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Masukan jumlah uang: Rp. ");
		tarik = sc.nextInt();
		
		if (tarik > saldo)
			System.out.println("Saldo anda tidak mencukupi");
		else
			ambil();
			System.out.println("Anda telah menarik sebesar Rp. " + tarik);
			System.out.println("Sisa saldo anda sebesar Rp. " + saldo);
	}
	
	void Setor_Uang() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Jumlah uang yang bisa dimasukkan hanya pecahan Rp 50.000 dan Rp 100.000");
		System.out.println("Masukan jumlah uang: Rp. ");
		setor = sc.nextInt();
		
		if (setor < 50000)
			System.out.println("Jumlah yang bisa dimasukkan minimal sebesar Rp 50.000");
		else
			if(setor % 50000 != 0)
				System.out.println("Jumlah yang bisa anda masukan hanya kelipatan Rp 50.000 dan Rp 100.000");
			else
				System.out.println("Anda telah menyetorkan sebesar Rp. " + setor);
				tabung();
				System.out.println("Jumlah saldo anda sebesar Rp. " + saldo);
	}
	
	void Transfer() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Silakan Masukkan Nomor rekening tujuan anda: "); norek = sc.next();
		System.out.println("Silakan Masukkan besaran tunai yang ingin di transfer: "); transfer = sc.nextInt();
		
		if(norek != "aca")
			System.out.println("Nomor rekening tujuan anda tidak ditemukan");
		else
			System.out.println("Nasabah tujuan anda");
		
	}
	
	//fuction
	void ambil() {
		saldo -= tarik;
	}
	
	void tabung() {
		saldo += setor;
	}

}
