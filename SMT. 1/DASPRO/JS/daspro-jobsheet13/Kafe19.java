import java.util.Scanner;
public class Kafe19 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;
        
        double diskon = 0;
        if (kodePromo.equals("DISKON50")) {
            diskon = 0.50;
            System.out.println("Selamat, anda mendapatkan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            diskon = 0.30; 
            System.out.println("Selamat, anda mendapatkan diskon 30%!");
        } else if (!kodePromo.equals("")) {
            System.out.println("Kode promo invalid!");
        }
        totalHarga -= totalHarga * diskon;
        return totalHarga;
    }
    public static void Menu(String namaPelanggan, boolean isMember) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();
        
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        
        System.out.print("Silahkan pilih menu yang Anda inginkan (1-6): ");
        int pilihanMenu = sc.nextInt();
        
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total harga yang harus dibayar: Rp" + totalHarga);
    }

    public static void main(String[] args) {
        Menu("Andi", true); 
    }
}
