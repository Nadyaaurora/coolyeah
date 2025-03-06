import java.util.Scanner;

public class DosenDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen19[] daftarDosen = new Dosen19[3];
        String kode, nama;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String gender = sc.nextLine();
            jenisKelamin = gender.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            usia = sc.nextInt();
            sc.nextLine();
            System.out.println("------------------------------------");

            daftarDosen[i] = new Dosen19(kode, nama, jenisKelamin, usia);
        }

        DataDosen19 dataDosen = new DataDosen19();
        System.out.println("====== DATA SEMUA DOSEN ======");
        dataDosen.dataSemuaDosen(daftarDosen);

        System.out.println("\n====== JUMLAH DOSEN PER JENIS KELAMIN ======");
        dataDosen.jumlahDosenPerJenisKelamin(daftarDosen);

        System.out.println("\n====== RATA-RATA USIA DOSEN PER JENIS KELAMIN ======");
        dataDosen.rerataUsiaDosenPerJenisKelamin(daftarDosen);

        System.out.println("\n====== DOSEN PALING TUA ======");
        dataDosen.infoDosenPalingTua(daftarDosen);

        System.out.println("\n====== DOSEN PALING MUDA ======");
        dataDosen.infoDosenPalingMuda(daftarDosen);
    }
}
