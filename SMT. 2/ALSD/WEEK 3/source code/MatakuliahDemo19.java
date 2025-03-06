import java.util.Scanner;

public class MatakuliahDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();
        sc.nextLine();

        Matakuliah19[] arrayOfMatakuliah = new Matakuliah19[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("\nMasukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            String kode = sc.nextLine();
            System.out.print("Nama       : ");
            String nama = sc.nextLine();
            System.out.print("SKS        : ");
            int sks = sc.nextInt();
            System.out.print("Jumlah Jam : ");
            int jumlahJam = sc.nextInt();
            sc.nextLine();

            arrayOfMatakuliah[i] = new Matakuliah19(kode, nama, sks, jumlahJam);
        }

        System.out.println("\n===== Data Mata Kuliah =====");
        for (Matakuliah19 mk : arrayOfMatakuliah) {
            mk.cetakInfo();
        }
    }
}
