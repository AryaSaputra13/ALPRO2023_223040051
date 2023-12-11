package Tugas;

import java.util.Scanner;

public class MatInt {
	int N=3;
	int M=3;
	int[][] a=new int[N][M];

	void IsiMatriksDiagonal() {
		for (int i=0; i<N ; i++) {
			for (int j=0; j<M ; j++) {
				a[i][j] = (i == j) ? 1 : 0;
			}
		}
	}
	
	void IsiMatriks() {
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<N ; i++) {
			for (int j=0; j<M ; j++) {
				System.out.print("Matriks ke "+i+", "+j+": ");
				a[i][j]=sc.nextInt();
			}
		}
	}

	
	void TampilMatriks() {
	
		for (int i=0; i<N ; i++) {
			for (int j=0; j<M ; j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	
	int GetElemen (int i, int j) {
		return a[i][j];
	}
	
	void SetElemen (int i, int j, int x) {
		a[i][j]=x;
	}
	
	static void salinMatriksA_B(MatInt A, MatInt B) { 
		int x;
		for (int i=0; i<A.N; i++){
			for (int j=0; i<A.M; j++){
				x=A.GetElemen(i,j);
				B.SetElemen(i,j,x);
			}
		}
		B.TampilMatriks();
	}
	
	static boolean IsSamaa_b(MatInt A, MatInt B) { 
		boolean sama=true;
		int i=0;
		int j=0;
		while ((i<A.N) && (sama==true)){
			j=0;
			while ((i<A.M) && (sama==true)){
				if (A.GetElemen(i,j) == B.GetElemen(i,j))
					j=j+1;
				else sama=false;
			}
			i = i+1;
		}
		return sama;
	}
	
	static MatInt PenMatriks(MatInt A, MatInt B) { 
		MatInt T=new MatInt();
		int x,y;
		for (int i=0; i<A.N; i++){
			for (int j=0; j<A.M; j++) {
				
				x = A.GetElemen(i,j);
				y = B.GetElemen(i,j);
				T.SetElemen(i,j,x+y);
			}
		}
		return T;
	}
	
	static MatInt PenguranganMatriks(MatInt A, MatInt B) { 
		MatInt T=new MatInt();
		int x,y;
		for (int i=0; i<A.N; i++){
			for (int j=0; j<A.M; j++) {
				
				x = A.GetElemen(i,j);
				y = B.GetElemen(i,j);
				T.SetElemen(i,j,x-y);
			}
		}
		return T;
	}
	
	static MatInt PerkalianMatriks(MatInt A, MatInt B) { 
		MatInt T=new MatInt();
		
		for (int i=0; i<A.N; i++){
			for (int j=0; j<A.M; j++) {
				T.SetElemen(i,j,0);
			}
		}
		
		int x,y,z;
		for (int i=0; i<A.N; i++){
			for (int j=0; j<B.M; j++) {
				for (int k=0; k<A.M; k++) {
					x = A.GetElemen(i,k);
					y = B.GetElemen(k,j);
					z = T.GetElemen(i, j);
					T.SetElemen(i,j,z+x*y);
				}
			}
		}
		return T;
	}
	
	
	public static void main(String[] args) {
		MatInt A=new MatInt();
		MatInt B=new MatInt();
		MatInt C=new MatInt();
		
		System.out.println("Matriks Dagonal");
		A.IsiMatriksDiagonal();;
		A.TampilMatriks();
		
		System.out.println("Matriks biasa");
		A.IsiMatriks();
		A.TampilMatriks();
		
		B.IsiMatriks();
		B.TampilMatriks();
		
		System.out.println("Hasil Penjumlahan Matriks: ");
		C = PenMatriks(A,B);
		C.TampilMatriks();
		
		System.out.println("Hasil Pengurangan Matriks: ");
		C = PenguranganMatriks(A,B);
		C.TampilMatriks();
		
		System.out.println("Hasil Perkalian Matriks: ");
		C = PerkalianMatriks(A,B);
		C.TampilMatriks();
		
	}
	
}
