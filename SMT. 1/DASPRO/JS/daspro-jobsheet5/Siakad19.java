import java.util.Scanner;
public class Siakad19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        double bobotKuis = 0.2;
        double bobotTugas = 0.15;
        double bobotUTS = 0.3;
        double bobotUAS = 0.35;
        String nilaiAkhirHuruf;
        String kualifikasi;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: "); 
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * bobotKuis) + (nilaiTugas * bobotTugas) + (nilaiUTS * bobotUTS) + (nilaiUAS * bobotUAS);

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        if(nilaiAkhir <= 39) {
            nilaiAkhirHuruf = "E";
            kualifikasi = "Gagal";
        }
        else if (nilaiAkhir >= 40 && nilaiAkhir <=50) {
            nilaiAkhirHuruf = "D";
            kualifikasi = "Kurang";
        }
        else if (nilaiAkhir >= 51 && nilaiAkhir <=60) {
            nilaiAkhirHuruf = "C";
            kualifikasi = "Cukup";
        }
        else if (nilaiAkhir >= 61 && nilaiAkhir <=65) {
            nilaiAkhirHuruf = "C+";
            kualifikasi = "Lebih dari cukup";
        }
        else if (nilaiAkhir >=66 && nilaiAkhir <=73) {
            nilaiAkhirHuruf = "B";
            kualifikasi = "Baik";
        }
        else if (nilaiAkhir >=74 && nilaiAkhir <=80) {
            nilaiAkhirHuruf = "B+";
            kualifikasi = "Lebih dari baik";
        }
        else {
            nilaiAkhirHuruf = "A";
            kualifikasi = "Sangat Baik";
        }
        
        System.out.println("Nilai akhir huruf: " + nilaiAkhirHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}