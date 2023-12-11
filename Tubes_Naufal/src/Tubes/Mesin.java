package Tubes;

import java.util.Scanner;

import java.util.Scanner;


public class Mesin {
	int N=2;
	Nasabah[] a=new Nasabah[N];
	
	void input() {
		Nasabah x;
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<N ; i++) {
			x = new Nasabah();
			
			x.isiNasabah();;;
			a[i]=x;
		}
	}
	
	void tampilRec() {
		for (int i = 0; i < N ; i++) {
			System.out.println("array ke "+i+":");
			 a[i].tampil();
		}
	}
	
	void CekSaldo(int i){
		 a[i].cekSaldo();
	}
	
	void Tarik(int i){
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.print("Jumlah: ");
		 double ambil=sc.nextDouble(); 
		 if (ambil > a[i].saldo) {
			 System.out.println("Saldo anda tidak tidak cukup");
		 } else {
			 a[i].saldo=a[i].saldo-=ambil; 
			 a[i].cekSaldo();
		 }
	}
	
	void tarikDefault(int active, double nominal) {
		if (nominal > a[active].saldo) {
	        System.out.println("Saldo tidak mencukupi.");
	    } else {
	    	a[active].saldo = a[active].saldo - nominal;
	    	System.out.println("Penarikan berhasil");
	    	System.out.println("Sisa Saldo anda: Rp "+a[active].saldo);
	    }
	}
	
	void transfer(int active) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan nomor rekening tujuan : ");
		String norekTujuan = sc.next();
		
		int ketemu = -1;
		
		for(int i = 0; i < N; i++) {
			if(a[i].norek.equals(norekTujuan)) {
				ketemu = i;
				break;
			}
		}
		if(ketemu == -1) {
			System.out.println("Nomor rekening tujuan tidak ditemukan");
		}else{
			System.out.println("Nomor rekening yang di tuju: "+a[ketemu].norek);
			System.out.println("Nama nasabah yang dituju: "+a[ketemu].nama);
			System.out.println("1. Lanjut");
			System.out.println("0. Batalkan");
			int pilih = sc.nextInt();
			switch(pilih) {
				case 1: System.out.print("Silakan masukkan jumlah nominal: ");
						double nominal = sc.nextDouble();
						if(nominal > a[active].saldo) {
							System.out.println("Saldo anda tidak mencukupi");
						}else {
							a[ketemu].saldo += nominal;
							a[active].saldo -= nominal;
							System.out.println("Tranfer berhasil");
							System.out.println("Sisa Saldo anda: "+ a[active].saldo);
							System.out.println("Saldo tujuan: "+a[ketemu].saldo);
						}
						break;
				case 0: mainMenu(active);break;
			}
			
		}
	}
	
	void topUp(int active) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan Nomor HP yang dituju:");
		String noHpTujuan = sc.next();
		
		int ketemu = -1;
		
		for(int i = 0; i < N; i++) {
			if (a[i].NoHP.equals(noHpTujuan)) {
				ketemu = i;
				break;
			}
		}
		
		if(ketemu == -1) {
			System.out.println("Nomor HP yang anda tuju tidak ditemukan");
		}else{
			System.out.print("Masukkan nominal Pulsa: ");
			double nominal = sc.nextDouble();
			if(nominal > a[active].saldo) {
				System.out.println("Saldo anda tidak mencukupi");
			}else {
				a[active].saldo -= nominal;
				System.out.println("Top-Up Pulsa berhasil");
				System.out.println("Sisa saldo anda Rp "+a[active].saldo);
			}
		}
	}
	
	void mainMenu(int active) {
	    int pilih = Menu();
	    while (pilih != 0) {
	        switch (pilih) {
	            case 1: CekSaldo(active); break;
	            case 2: SubMTarik(active); break;
	            case 3: transfer(active); break;
	            case 4: topUp(active); break;
	            case 5: SubMPembayaran(active); break; 
	            case 0: System.out.println("Terima Kasih");System.exit(pilih); break;
	            default: System.out.print("Pilihan salah! ");
	        }
	        pilih = Menu();
	    }
	}
	
	void SubMTarik(int active) {
		Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Pilihan Nominal: ");
		 System.out.println("1. Rp 50.000 ");
		 System.out.println("2. Rp 100.000 ");
		 System.out.println("3. Rp 200.000");
		 System.out.println("4. Jumlah Lain-nya");
		 System.out.println("0. Kembali");
		 System.out.print("Pilihan anda ");
		 int subPilih = sc.nextInt();
		 
		 switch (subPilih) {
	         case 1: tarikDefault(active,50000);break;
	         case 2: tarikDefault(active,100000);break;
	         case 3: tarikDefault(active,200000);break;
	         case 4: Tarik(active);break;
	         case 0: mainMenu(active);break;
	         default:
             System.out.println("Pilihan salah!");
		 }
	}
	
	void SubMPembayaran(int active) {
		Scanner sc= new Scanner(System.in);
		 
		System.out.println("Menu: ");
		System.out.println("1. Pembayran PDAM ");
		System.out.println("2. Pembayaran Listrik ");
		System.out.println("0. Kembali");
		System.out.print("Pilihan anda ");
		int subPilih = sc.nextInt();
		 
		switch (subPilih) {
        	case 1: System.out.println("Melakukan Pembayaran PDAM");break;
        	case 2: System.out.println("Melakukan Pembayaran Listrik");break;
        	case 0: mainMenu(active);break;
        default:
             	System.out.println("Pilihan salah!");
     }
	}
	
	int Menu(){ 
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Menu: ");
		 System.out.println("1. Cek Saldo "); //beres
		 System.out.println("2. Tarik "); //beres
		 System.out.println("3. Transfer");//beres
		 System.out.println("4. Top-up Pulsa ");//beres
		 System.out.println("5. Pembayaran ");
		 System.out.println("0. Keluar ");
		 System.out.print("Pilihan anda ");
		 int X=sc.nextInt();
		 return X;
	}
	
	int login(){
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Logiiin... ");
		 System.out.print("Norek: ");String norek=sc.next();
		 boolean ketemu;
		 int i;
		 int ulang=1;
		 do {
			 System.out.print("Pin: ");String pinku=sc.next();
			 i=0;
			 ketemu=false;
			 while ((ketemu==false)&&(i<N)){
				 if ((a[i].norek.equals(norek)) && (a[i].pin.equals(pinku)))
					 ketemu=true;
				 else
					 i++;
			 } 
			 ulang++;
		 }	while((ketemu==false)&&(ulang<=3));
		 		if (ketemu==true){
		 			System.out.println("Selamat Datang");
		 			return i;
		 		} else
		 	return -1; 
	}

	public static void main(String[] args) {
		Mesin A=new Mesin();
		A.input();
		System.out.println();
		int active = A.login();
		A.mainMenu(active);
		

	}
}
