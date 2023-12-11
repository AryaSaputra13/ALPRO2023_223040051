package Tugas;

import java.util.Scanner;

public class karyawan {
	int gol;
	double gapok,tunjangan,bonus,gatot;
	
	String kodeP;
	
	int hadir;
	
	void bacaKaryawan() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Gol :");
		gol = sc.nextInt();
		
		System.out.print("Kode Pegawai: ");
		kodeP = sc.next();
		
		System.out.print("Kehadiran: ");
		hadir = sc.nextInt();
		
		SetGapokBonus();
		
		gatot = HitungGatot();		
	 }

		void SetGapokBonus() {
			switch(gol) {
				case 1 :
					gapok = 2000000;
					bonus = 0;
					tunjangan = gapok * 0.02;
					break;
				case 2 :
					gapok = 2500000;
					bonus = 100000;
					tunjangan = gapok * 0.02;
					break;
				case 3 :
					gapok = 3000000;
					bonus = 200000;
					tunjangan = gapok * 0.03;
					break;
				case 4 :
					gapok = 4000000;
					bonus = 300000;
					tunjangan = gapok * 0.04;
					break;
				  default :
					  System.out.print("Data yang anda masukkan tidak valid");
					  break;
			}
		}
		
		double HitungTunjangan() {
			return gapok * 0.02;
		}
		
		Double HitungGatot() {
			double gajitotal;
			
			gajitotal = gapok + bonus + tunjangan + (50000 * hadir);
			return gajitotal;
		}
		
		void TulisKaryawan() {
			System.out.println("Gol: "+gol+", "+
					"Gaji pokok: "+gapok+", "+
					"Bonus: "+tunjangan+", "+
					"Gaji Total: "+gatot+", "+
					"Kode Pegawai: "+kodeP+", "+
					"Hadir: "+hadir);
		}
		
		public static void main(String[] args) {
			karyawan K = new karyawan();
			
			K.bacaKaryawan();
			
			K.TulisKaryawan();
			
		}
}


