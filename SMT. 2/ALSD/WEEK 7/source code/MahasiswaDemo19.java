import java.util.Scanner;
public class MahasiswaDemo19 {
    public static void main(String[] args) {
        MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19(5);
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM  : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK  : ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("-----------------------");
            list.tambah(new Mahasiswa19(nim, nama, kelas, ipk));
        }

        list.tampil();
        // pencarian data senquential
        System.out.println("------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}
