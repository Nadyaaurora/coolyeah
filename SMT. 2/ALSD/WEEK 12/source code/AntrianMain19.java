import java.util.Scanner;
public class AntrianMain19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Antrian19 antrian = new Antrian19();

        int pilih;
        do {
            System.out.println("\n==== MENU ANTRIAN KEMAHASISWAAN ====");
            System.out.println("1. Tambah antrian");
            System.out.println("2. Panggil antrian");
            System.out.println("3. Lihat antrian terdepan");
            System.out.println("4. Lihat antrian terakhir");
            System.out.println("5. Lihat jumlah antrian");
            System.out.println("6. Cetak semua antrian");
            System.out.println("7. Kosongkan antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan IPK  : ");
                    double ipk = sc.nextDouble(); sc.nextLine();

                    Mahasiswa19 mhs = new Mahasiswa19(nim, nama, kelas, ipk);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    Mahasiswa19 dipanggil = antrian.dequeue();
                    if (dipanggil != null) {
                        System.out.print("Mahasiswa yang dipanggil: ");
                        dipanggil.tampilInformasi();
                    }
                    break;

                case 3:
                    antrian.peek();
                    break;

                case 4:
                    antrian.peekRear();
                    break;

                case 5:
                    System.out.println("Jumlah antrian: " + antrian.getSize());
                    break;

                case 6:
                    antrian.print();
                    break;

                case 7:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
