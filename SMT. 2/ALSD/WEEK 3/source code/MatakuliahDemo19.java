import java.util.Scanner;
public class MatakuliahDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah19[] arrayOfMatakuliah = new Matakuliah19[3];

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            String kode = sc.nextLine();
            System.out.print("Nama       : ");
            String nama = sc.nextLine();
            System.out.print("SKS        : ");
            int sks = sc.nextInt();
            System.out.print("Jumlah Jam : ");
            int jumlahJam = sc.nextInt();
            sc.nextLine(); 
            System.out.println("------------------------------------");
            arrayOfMatakuliah[i] = new Matakuliah19(kode, nama, sks, jumlahJam);
        }

        System.out.println("\n===== Data Matakuliah =====");
        for (Matakuliah19 mk : arrayOfMatakuliah) {
            mk.cetakInfo();
        }
    }
}
