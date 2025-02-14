import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] namaMK = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        // Input data
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk Mata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }

        while (true) {
            System.out.println("\n===== MENU JADWAL KULIAH =====");
            System.out.println("1. Tampilkan Seluruh Jadwal");
            System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("\n===== SELURUH JADWAL KULIAH =====");
                    tampilkanJadwal(namaMK, sks, semester, hariKuliah);
                    break;

                case 2:
                    System.out.print("\nMasukkan hari kuliah yang ingin ditampilkan: ");
                    String hariCari = sc.nextLine();
                    System.out.println("\n===== JADWAL KULIAH HARI " + hariCari.toUpperCase() + " =====");
                    tampilkanJadwalHari(namaMK, sks, semester, hariKuliah, hariCari);
                    break;

                case 3:
                    System.out.print("\nMasukkan semester yang ingin ditampilkan: ");
                    int semesterCari = sc.nextInt();
                    System.out.println("\n===== JADWAL KULIAH SEMESTER " + semesterCari + " =====");
                    tampilkanJadwalSemester(namaMK, sks, semester, hariKuliah, semesterCari);
                    break;

                case 4:
                    System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
                    String mkCari = sc.nextLine();
                    System.out.println("\n===== HASIL PENCARIAN MATA KULIAH =====");
                    cariMataKuliah(namaMK, sks, semester, hariKuliah, mkCari);
                    break;

                case 5:
                    System.out.println("\nTerima kasih telah menggunakan program ini!");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }

    // Menampilkan seluruh jadwal
    public static void tampilkanJadwal(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah) {
        for (int i = 0; i < namaMK.length; i++) {
            System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
        }
    }

    // Menampilkan jadwal berdasarkan hari
    public static void tampilkanJadwalHari(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hari);
        }
    }

    // Menampilkan jadwal berdasarkan semester
    public static void tampilkanJadwalSemester(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, int sem) {
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (semester[i] == sem) {
                System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah untuk semester " + sem);
        }
    }

    // Mencari mata kuliah berdasarkan nama
    public static void cariMataKuliah(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, String nama) {
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (namaMK[i].equalsIgnoreCase(nama)) {
                System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah \"" + nama + "\" tidak ditemukan.");
        }
    }
}
