package Array;

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
		ArrayInt B=new ArrayInt(); //prosedur sama nilai yg berbeda, klo tipe sama bisa disalin
		
		A.isiarray();
		A.tampilarray();
		A.hitungrata();
		A.carimaks();
		A.carimaks2();
		
		B.isiarray();
		B.tampilarray();
		B.hitungrata();
		B.carimaks();
		B.carimaks2();
		
		salinlarika_b(A,B);
		System.out.println("out Array A dan B sama ? " +issamaa_b(A,B));
		
	}
}
