import java.util.Scanner;
public class DosenDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen : ");
        int jumDosen = sc.nextInt();
        sc.nextLine(); 
        DataDosen19 list = new DataDosen19(jumDosen);

        for (int i = 0; i < jumDosen; i++) {
            System.out.println("Dosen ke-" + (i + 1));
            System.out.print("NIDN  : ");
            String nidn = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Matkul: ");
            String matkul = sc.nextLine();
            System.out.print("Usia  : ");
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------");
            list.tambah(new Dosen19(nama, nidn, usia, matkul));
        }

        list.tampil();

        // Pencarian data berdasarkan nama (sequential)
        System.out.println("------------------------------------");
        System.out.println("Pencarian data (nama)");
        System.out.println("------------------------------------");
        System.out.print("Masukkan nama dosen yang dicari: ");
        String cariNama = sc.nextLine();
        list.sequentialSearch(cariNama);

        // Pencarian data berdasarkan usia (binary)
        System.out.println("------------------------------------");
        System.out.println("Pencarian data (usia)");
        System.out.println("------------------------------------");
        System.out.print("Masukkan usia dosen yang dicari: ");
        int cariUsia = sc.nextInt();
        int posisi = list.binarySearch(cariUsia, 0, jumDosen - 1);
        if (posisi != -1) {
            System.out.println("Dosen dengan usia " + cariUsia + " ditemukan:");
            list.listDsn[posisi].tampil();
        } else {
            System.out.println("Dosen dengan usia " + cariUsia + " tidak ditemukan.");
        }
    }
}