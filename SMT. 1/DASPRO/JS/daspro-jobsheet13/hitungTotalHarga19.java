import java.util.Scanner;
public class hitungTotalHarga19 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    public static double cekPromo(String kodePromo) {
        double diskon = 0;
        
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = 0.50;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = 0.30;
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid, tidak ada pengurangan harga.");
        }
        return diskon;
    }

    public static void prosesPesanan() {
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0;
        String lanjutPesan;

        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();
        double diskon = cekPromo(kodePromo);

        while (true) {
            System.out.print("Masukkan nomor menu yang ingin Anda pesan (1-6): ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();

            int hargaMenu = hitungTotalHarga(pilihanMenu, banyakItem);
            totalKeseluruhan += hargaMenu;
            System.out.println("Total harga untuk pesanan Anda: Rp" + hargaMenu);
            System.out.print("Apakah Anda ingin memesan menu lainnya? (y/t): ");
            lanjutPesan = sc.nextLine();

            if (!lanjutPesan.equalsIgnoreCase("y")) {
                break;
            }
        }

        double totalDenganDiskon = totalKeseluruhan * (1 - diskon);

        System.out.println("\nTotal keseluruhan sebelum diskon: Rp" + totalKeseluruhan);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Total yang harus dibayar setelah diskon: Rp" + totalDenganDiskon);
    }
    public static void main(String[] args) {
        prosesPesanan();
    }
}
