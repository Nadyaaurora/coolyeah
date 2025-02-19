import java.util.Scanner;

public class try3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah : ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] matkul = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk Mata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            matkul[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    seluruhJadwal(matkul, sks, semester, hariKuliah);
                    break;
                case 2:
                    jadwalHari(matkul, sks, semester, hariKuliah, sc);
                    break;
                case 3:
                    jadwalSemester(matkul, sks, semester, hariKuliah, sc);
                    break;
                case 4:
                    cariMataKuliah(matkul, sks, semester, hariKuliah, sc);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (pilihan != 5);
    }

    static void seluruhJadwal(String[] matkul, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\n========== JADWAL KULIAH ==========");
        System.out.printf("%-20s  %-5s  %-10s  %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-20s  %-5d  %-10d  %-10s\n", matkul[i], sks[i], semester[i], hariKuliah[i]);
        }
    }

    static void jadwalHari(String[] matkul, int[] sks, int[] semester, String[] hariKuliah, Scanner sc) {
        System.out.print("\nMasukkan hari kuliah yang ingin ditampilkan: ");
        String hariCari = sc.nextLine();
        boolean ditemukan = false;

        System.out.println("\n===== JADWAL KULIAH HARI " + hariCari.toUpperCase() + " =====");
        for (int i = 0; i < matkul.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hariCari)) {
                System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hariCari);
            return;
        }
    }

    static void jadwalSemester(String[] matkul, int[] sks, int[] semester, String[] hariKuliah, Scanner sc) {
        System.out.print("\nMasukkan semester yang ingin ditampilkan: ");
        int semesterCari = sc.nextInt();
        boolean ditemukan = false;

        System.out.println("\n===== JADWAL KULIAH SEMESTER " + semesterCari + " =====");
        for (int i = 0; i < matkul.length; i++) {
            if (semester[i] == semesterCari) {
                System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah untuk semester " + semesterCari);
            return;
        }
    }

    static void cariMataKuliah(String[] matkul, int[] sks, int[] semester, String[] hariKuliah, Scanner sc) {
        System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
        String cari = sc.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < matkul.length; i++) {
            if (matkul[i].equalsIgnoreCase(cari)) {
                System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah \"" + cari + "\" tidak ditemukan.");
            return;
        }
    }
}
