package Tugas;

import java.util.Scanner;

public class ArrayInt {
	int N=5;
	int[] a=new int[N];
	
	void isiarray() {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<N ; i++) {
			System.out.print("el array ke "+i+":");
			a[i]=sc.nextInt();
		}
	}
	
	void tampilarray() {
	
		for (int i=0; i<N ; i++) {
			System.out.println("array ke "+i+":"+ a[i]);
			
		}
	}
	
	void hitungrata() {
		double total=0, rata=0;
		for (int i=0; i<N ; i++) {
			total=total+a[i];
		
		}
		rata=total/N;
		System.out.println("nilai rata-rata = "+rata);
	}
	
	void carimaks() {
		int maks=a[0]; 
		int imaks=0;
		for (int i=1; i<N ; i++) {
			if (a[i]>maks) {
				maks=a[i];
				imaks=i;
			}
		}
		System.out.println("nilai terbesar = "+maks);
		System.out.println("nilai terbesar di indeks ke = "+maks);
	}
	
	void carimaks2() { 
		int imaks=0;
		for (int i=1; i<N ; i++) {
			if (a[i]>a[imaks]) {
				imaks=i;
			}
		}
		System.out.println("nilai terbesar = "+a[imaks]);
		System.out.println("nilai terbesar di indeks ke = "+imaks);
	}
	
	int SeqSearch(int x) {
		int i;
		i=0;
		
		while ((i < N-1) && (a[i] != x)) {
			i = i + 1;
		}
		
		if (a[i] == x)
			return i;
		else 
			return -1;	
	}
	
	int BinSearch(int x) {
		int iAwal=0, iAkhir=N-1, k = 0;
		boolean ketemu=false;
		
		while ((iAwal <= iAkhir) && (ketemu == false)) {
			k = (iAwal + iAkhir)/2;
			if (a[k] == x)
				ketemu = true;
			else if (a[k] > x)
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
			if (a[k] == x)
				ketemu = true;
			else 
				if (a[k] > x)
					iAkhir = k + 1;
				else
					iAwal = k - 1;
		}
		if (ketemu == true)
			return k;
		else 
			return -1;
	}
	
	void SelectionSortMembesar() { //terurut membesar
		int imaks;
		int temp;
		for (int pass = 1; pass <= N-1; pass ++) {
			imaks = 0;
			for (int i = 1;i <= N-pass; i++) {
				if (a[imaks] < a[i])
					imaks = i;
			}
			temp = a[imaks];
			a[imaks] = a[N-pass];
			a[N-pass] = temp;
		}
	}
	
	void SelectionSortMengecil() { //terurut mengecil
		int imaks;
		int temp;
		for (int pass = 1; pass <= N-1; pass ++) {
			imaks = 0;
			for (int i = 1;i <= N-pass; i++) {
				if (a[imaks] > a[i])
					imaks = i;
			}
			temp = a[imaks];
			a[imaks] = a[N-pass];
			a[N-pass] = temp;
		}
	}
	
	int GetElemen (int i) {
		return a[i];
	}
	
	void SetElemen (int i, int x) {
		a[i]=x;
	}
	
	static void salinlarika_b(ArrayInt A, ArrayInt B) { 
		int x;
		for (int i=0; i<A.N; i++){
		x=A.GetElemen(i);
		B.SetElemen(i, x);
		}
		B.tampilarray();
	}
	
	static boolean issamaa_b(ArrayInt A, ArrayInt B) { 
		boolean sama=true;
		int i=0;
		while ((i<A.N) && (sama==true)){
			if (A.GetElemen(i) == B.GetElemen(i))
				i=i+1;
			else sama=false;
		}
		return sama;
	}
	
	public static void main(String[] args) {
		ArrayInt A=new ArrayInt();
		ArrayInt B=new ArrayInt(); 
		
		A.isiarray();
		
		salinlarika_b(A,B);
		System.out.println("out Array A dan B sama ? " +issamaa_b(A,B));
		
		System.out.println("Membesar");
		A.SelectionSortMembesar();
		A.tampilarray();
		
		System.out.println("Mengecil");
		A.SelectionSortMengecil();
		A.tampilarray();
		
		int idx = A.BinSearch2(5);
		System.out.println("Data ditemukan pada index ke-" + idx);
		
		int ix = A.SeqSearch(5);
		System.out.println("Data ditemukan pada index ke-" + ix);
		
		A.hitungrata();
		A.carimaks();
		A.carimaks2();
		
		B.isiarray();
		B.tampilarray();
		B.hitungrata();
		B.carimaks();
		B.carimaks2();
		
		
	}

}

