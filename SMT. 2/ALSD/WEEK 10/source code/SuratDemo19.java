import java.util.Scanner;
public class SuratDemo19{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih;

        StackSurat stack = new StackSurat(10); // ukuran stack bisa diubah

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat (berdasarkan nama)");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat : ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I) : ");
                    char jenis = scan.nextLine().toUpperCase().charAt(0);
                    if (jenis != 'S' && jenis != 'I') {
                        System.out.println("Jenis izin tidak valid!");
                        break;
                    }
                    System.out.print("Durasi (hari) : ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    Surat19 surat = new Surat19(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.println("Surat berhasil ditambahkan.");
                    break;

                case 2:
                    Surat19 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat dari " + proses.namaMhs);
                    }
                    break;

                case 3:
                    Surat19 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dikumpulkan oleh " + terakhir.namaMhs);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa : ");
                    String cariNama = scan.nextLine();
                    stack.cariSurat(cariNama);
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
