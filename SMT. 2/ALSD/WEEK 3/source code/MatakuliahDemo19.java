import java.util.Scanner;
public class MatakuliahDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah19[] arrayOfMatakuliah = new Matakuliah19[3];     
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah19();
            arrayOfMatakuliah[i].tambahData(sc);
        }

        System.out.println("\n====== DATA MATAKULIAH ======");
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {   
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
            System.out.println("SKS        : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("------------------------------------");
        }
    }
}
