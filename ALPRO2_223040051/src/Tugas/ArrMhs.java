package Tugas;

import java.util.Scanner;

public class ArrMhs {
	int N=4;
	Mahasiswa[] a=new Mahasiswa[N];
	
	void isiarray() {
		Mahasiswa x;
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<N ; i++) {
			x = new Mahasiswa();
			
			x.BacaMhs();;
			a[i]=x;
		}
	}
	
	void tampilarray() {
		for (int i = 0; i < N ; i++) {
			System.out.println("array ke "+i+":");
			 a[i].TulisMhs();;
		}
	}
	
	int SeqSearch(int x) {
		int i;
		i=0;
		
		while ((i < N-1) && (a[i].Nim != x)) {
			i = i + 1;
		}
		
		if (a[i].Nim == x)
			return i;
		else 
			return -1;	
	}
	
	int BinSearch(int x) {
		int iAwal=0, iAkhir=N-1, k = 0;
		boolean ketemu=false;
		
		while ((iAwal <= iAkhir) && (ketemu == false)) {
			k = (iAwal + iAkhir)/2;
			if (a[k].Nim == x)
				ketemu = true;
			else if (a[k].Nim > x)
					iAkhir = k - 1;
				else
					iAwal = k + 1;
		}
		if (ketemu == true)
			return k;
		else 
			return -1;
	}
	
	int BinSearch2(int x) {
		int iAwal=0, iAkhir=N-1, k = 0;
		boolean ketemu=false;
		
		while ((iAwal <= iAkhir) && (ketemu == false)) {
			k = (iAwal + iAkhir)/2;
			if (a[k].Nim == x)
				ketemu = true;
			else 
				if (a[k].Nim > x)
					iAkhir = k + 1;
				else
					iAwal = k - 1;
		}
		if (ketemu == true)
			return k;
		else 
			return -1;
	}
	
	void CariMaks() {
		double maks=a[0].IPK; 
		int imaks=0;
		for (int i=1; i<N ; i++) {
			if (a[i].IPK>maks) {
				maks=a[i].IPK;
				imaks=i;
			}
		}
		System.out.println("nilai terbesar = "+maks);
		System.out.println("nilai terbesar di indeks ke = "+maks);
		a[imaks].TulisMhs();;
	}
	
	void SelectionSortMembesar() { //terurut membesar
		int imaks;
		Mahasiswa temp = new Mahasiswa();
		for (int pass = 1; pass <= N-1; pass ++) {
			imaks = 0;
			for (int i = 1;i <= N-pass; i++) {
				if (a[imaks].Nim < a[i].Nim)
					imaks = i;
			}
			temp = a[imaks];
			a[imaks] = a[N-pass];
			a[N-pass] = temp;
		}
	}
	
	void SelectionSortMengecil() { //terurut mengecil
		int imaks;
		Mahasiswa temp = new Mahasiswa();
		for (int pass = 1; pass <= N-1; pass ++) {
			imaks = 0;
			for (int i = 1;i <= N-pass; i++) {
				if (a[imaks].Nim > a[i].Nim)
					imaks = i;
			}
			temp = a[imaks];
			a[imaks] = a[N-pass];
			a[N-pass] = temp;
		}
	}
	
	Mahasiswa GetElemen (int i) {
		return a[i];
	}
	
	void SetElemen (int i, Mahasiswa x) {
		a[i]=x;
	}
	
	static void SalinLarikA_B(ArrMhs A, ArrMhs B) { 
		Mahasiswa x;
		for (int i=0; i<A.N; i++){
			x=A.GetElemen(i);
			B.SetElemen(i, x);
		}
//		B.tampilarray();
	}
	public static void main(String[] args) {
		ArrMhs A=new ArrMhs();
		ArrMhs B=new ArrMhs();
		
		A.isiarray();
		A.tampilarray();
		
		System.out.println();
		A.CariMaks();
	
		System.out.println();
		SalinLarikA_B(A, B);
		System.out.println("out Array A dan B sama ? ");
		B.tampilarray();
		
		System.out.println();
		System.out.println("Mengurut Membesar");
		A.SelectionSortMembesar();
		A.tampilarray();
		
		System.out.println();
		System.out.println("Mengurut Mengecil");
		A.SelectionSortMengecil();
		A.tampilarray();
		
		System.out.println();
		System.out.println("Cari");
		System.out.println();
		int ix = A.SeqSearch(3);
		System.out.println("Sequen: Data ditemukan pada index ke-" + ix);
		
		System.out.println();
		int idx = A.BinSearch2(3);
		System.out.println("Binary: Data ditemukan pada index ke-" + idx);
		
		
	}
}
