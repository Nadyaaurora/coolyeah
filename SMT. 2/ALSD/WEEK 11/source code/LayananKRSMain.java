import java.util.Scanner;

public class LayananKRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS();
        int pilihan;

        do {
            System.out.println("\n====== MENU ANTRIAN KRS ======");
            System.out.println("1. Tambah mahasiswa ke antrian");
            System.out.println("2. Layani mahasiswa");
            System.out.println("3. Tampilkan 2 mahasiswa terdepan");
            System.out.println("4. Tampilkan semua antrian");
            System.out.println("5. Lihat mahasiswa terakhir");
            System.out.println("6. Jumlah mahasiswa dalam antrian");
            System.out.println("7. Jumlah mahasiswa yang sudah KRS");
            System.out.println("8. Jumlah mahasiswa yang belum KRS");
            System.out.println("9. Kosongkan antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (antrian.isMaxDilayaniDPA()) {
                        System.out.println("Kuota maksimal mahasiswa sudah diproses.");
                        break;
                    }
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.menambahAntrian(mhs);
                    break;

                case 2:
                    Mahasiswa[] dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Mahasiswa yang dilayani:");
                        System.out.println("NIM - NAMA - PRODI - KELAS");
                        for (Mahasiswa m : dilayani) {
                            m.tampilkanData();
                        }
                    }
                    break;

                case 3:
                    antrian.tampilkanDuaTerdepan();
                    break;

                case 4:
                    antrian.tampilkanSemua();
                    break;

                case 5:
                    antrian.tampilkanTerakhir();
                    break;

                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;

                case 7:
                    System.out.println("Jumlah mahasiswa sudah KRS: " + antrian.getJumlahSudahKRS());
                    break;

                case 8:
                    System.out.println("Jumlah mahasiswa belum KRS: " + antrian.getJumlahBelumKRS());
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);

        sc.close();
    }
}
