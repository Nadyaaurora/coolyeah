import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        String merk, kategori;
        int ukuran = 0;
        int harga = 0;

        System.out.print("Masukkan merk sepatu: ");
        merk = input19.nextLine();
        System.out.print("Masukkan kategori sepatu: ");
        kategori = input19.nextLine();
        System.out.print("Masukkan ukuran sepatu: ");
        ukuran = input19.nextInt();

        if (merk.equalsIgnoreCase("Specs")) {
            if (kategori.equalsIgnoreCase("Slip On")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                    }
                }
            }
            if (kategori.equalsIgnoreCase("High Top")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                    }
                }
            }
        } else if (merk.equalsIgnoreCase("910")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                    }
                }
            }
            if (kategori.equalsIgnoreCase("Man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                    }
                }
            }
        } else if (merk.equalsIgnoreCase("Ortus")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                    }
                }
            }
            if (kategori.equalsIgnoreCase("Adult")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                    }
                }
            }
        }
        // Output jika harga ditemukan
        if (harga > 0) {
            System.out.println("Harga Sepatu: " + harga);
        } else {
            System.out.println("Tidak valid");
        }
    }
}

