package Prototype;

import java.util.Scanner;

public class P1_ATM {
	static double saldo = 1000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selamat datang di ATM");
            System.out.println("Pilih opsi:");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Uang");
            System.out.println("3. Setor Uang");
            System.out.println("4. Keluar");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    cekSaldo();
                    break;
                case 2:
                    tarikUang();
                    break;
                case 3:
                    setorUang();
                    break;
                case 4:
                    System.out.println("Terima kasih, sampai jumpa!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    static void cekSaldo() {
        System.out.println("Saldo Anda saat ini: $" + saldo);
    }

    static void tarikUang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang yang ingin Anda tarik: $");
        double jumlahTarik = scanner.nextDouble();

        if (jumlahTarik > saldo) {
            System.out.println("Saldo tidak mencukupi.");
        } else {
            saldo -= jumlahTarik;
            System.out.println("Anda telah menarik $" + jumlahTarik);
            System.out.println("Saldo Anda saat ini: $" + saldo);
        }
    }

    static void setorUang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang yang ingin Anda setor: $");
        double jumlahSetor = scanner.nextDouble();

        if (jumlahSetor <= 0) {
            System.out.println("Jumlah setoran harus lebih dari 0.");
        } else {
            saldo += jumlahSetor;
            System.out.println("Anda telah menyetor $" + jumlahSetor);
            System.out.println("Saldo Anda saat ini: $" + saldo);
        }
    }
}

