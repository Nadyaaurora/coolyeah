import java.util.Scanner; // Kami mengimpor semua class util agar dapat digunakan dengan mudah
public class prestasi {
    static Scanner sc = new Scanner(System.in); // Mendeklarasikan tipe data beserta variabel yang digunakan.
    static int counter = 0; // berfungsi untuk mengetahui berapa jumlah data yang telah diinputkan

    public static void inputPrestasi(String arr[][], int tahun_prestasi[]) {
        System.out.println("======================================"); // menampilkan header agar mengerti bahwa kita telah masuk di bagian pencatatan prestasi mahasiswa
        System.out.println("=    Pencatatan Prestasi Mahasiswa   =");
        System.out.println("======================================");
        System.out.print("> Masukkan Nama Mahasiswa: : "); // Kita dapat memasukkan nama, NIM, dan jenis prestasi mahasiswa lebih dari 1 dan dapat disimpan dalam array.
        arr[0][counter] = sc.nextLine();
        System.out.print("> Masukkan NIM Mahasiswa: : ");
        arr[1][counter] = sc.nextLine();
        System.out.print("> Masukkan Jenis Prestasi Mahasiswa: : ");
        arr[2][counter] = sc.nextLine();
        String tingkat_prestasi;

        // Melakukan looping dalam memasukkan tingkat prestasi mahasiswa selama memenuhi kondisi pada while tersebut.
        do {
            System.out.print("> Masukkan Tingkat Prestasi Mahasiswa(Lokal/Nasional/Internasional): ");
            tingkat_prestasi = sc.nextLine();
            if (!tingkat_prestasi.equalsIgnoreCase("Lokal") && !tingkat_prestasi.equalsIgnoreCase("Nasional") && !tingkat_prestasi.equalsIgnoreCase("Internasional")) {
                System.out.println("! Error: Tingkat Prestasi tidak valid");
            }
        } while (!tingkat_prestasi.equalsIgnoreCase("Lokal") && !tingkat_prestasi.equalsIgnoreCase("Nasional") && !tingkat_prestasi.equalsIgnoreCase("Internasional"));
        arr[3][counter] = tingkat_prestasi;

        do {
            System.out.print("> Masukkan Tahun Prestasi Mahasiswa: ");
            tahun_prestasi[counter] = sc.nextInt();
            if (tahun_prestasi[counter] < 2010 || tahun_prestasi[counter] > 2024) System.out.println("! Error: Tahun tidak berada dalam jangkauan");
        } while (tahun_prestasi[counter] < 2010 || tahun_prestasi[counter] > 2024);
        System.out.print("==== Program Pencatatan Prestasi Berhasil ====\n");
        counter++; 
        // counter++ bertujuan untuk menambahkan satu data di dalam sebuah daftar.
    }

    public static void outputPrestasi(String arr[][], int tahun_prestasi[]) {
        System.out.println("======================================");
        System.out.println("=     Mencetak Prestasi Mahasiswa    =");
        System.out.println("======================================");

        // Kode dibawah ini digunakan untuk memberikan kondisi, selama perulangan memenuhi kondisi.
        // Nested for ditulis karena array yang ditulis adalah array 2 dimensi.
        if (counter != 0) {
            for (int i = 0; i < counter; i++) {
                for (int j = 0; j < 4; j++) {
                    switch (j) {
                        case 0:
                            System.out.print("> |Nama: " + arr[0][i] + " |\t|");
                            break;
                        case 1:
                            System.out.print("NIM: " + arr[1][i] + " |\t|");
                            break;
                        case 2:
                            System.out.print("Jenis: " + arr[2][i] + " |\t|");
                            break;
                        case 3:
                            System.out.print("Tingkat: " + arr[3][i] + " |\t|");
                            break;
                    }
                }
                System.out.print("Tahun: " + tahun_prestasi[i] + " |\n");
            }
        } else {
            System.out.println("=== Data Prestasi Kosong ===");
        }
    }

    public static void analisisPrestasi(String arr[][], int tahun_prestasi[]) {
        System.out.println("==== Program Mencari Jenis Prestasi Mahasiswa ====");
        System.out.print("> Masukkan jenis prestasi yang ingin dicari: ");
        String cari = sc.nextLine();
        boolean ketemu = false;
        System.out.print("> Masukkan tahun prestasi yang ingin dicari (Masukkan 0 untuk menampilkan semua): ");
        int tahun = sc.nextInt();

        // Penjelasannya sama seperti sebelumnya.
        for (int i = 0; i < counter; i++) {
            if (arr[2][i].equalsIgnoreCase(cari)) {
                if (tahun == 0) {
                    System.out.print("-> Prestasi " + cari + " didapatkan oleh " + arr[0][i] + " dengan NIM " + arr[1][i] + " pada tahun " + tahun_prestasi[i] + "\n");
                    ketemu = true;
                } else if (tahun_prestasi[i] == tahun) {
                    System.out.print("-> Prestasi " + cari + " didapatkan oleh " + arr[0][i] + " dengan NIM " + arr[1][i] + " pada tahun " + tahun_prestasi[i] + "\n");
                    ketemu = true;
                }
            }
        }
        if (!ketemu) System.out.print("Prestasi dengan tahun yang sesuai tidak ditemukan\n");
    }

    public static void main(String[] args) {
        // Kita dapat memasukkan data sebanyak 25 kali.
        String prestasi[][] = new String[4][99999];
        int tahun_prestasi[] = new int[99999];
        int pilihan = 0;
        do {
            System.out.println("======================================");
            System.out.println("=                MENU                =");
            System.out.println("======================================");
            System.out.println("1. Input Prestasi");
            System.out.println("2. Output Prestasi");
            System.out.println("3. Analisis Prestasi");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    inputPrestasi(prestasi, tahun_prestasi);
                    break;
                case 2:
                    outputPrestasi(prestasi, tahun_prestasi);
                    break;
                case 3:
                    analisisPrestasi(prestasi, tahun_prestasi);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        } while (pilihan != 4);
    }
}