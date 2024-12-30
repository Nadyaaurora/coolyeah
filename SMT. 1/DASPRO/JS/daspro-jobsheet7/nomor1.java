import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiket = 0;
        int jumlahTiket;
        double totalPenjualan = 0;
        double totalHarga; 

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (atau ketik 0 untuk keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan coba lagi.");
                break;
            } 
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan coba lagi.");
                continue; 
            }
            
            if (jumlahTiket > 10) {
                totalHarga = jumlahTiket * (hargaTiket - (hargaTiket * 0.15)); 
                System.out.println("Diskon 15%");
            } else if (jumlahTiket > 4) {
                totalHarga = jumlahTiket * (hargaTiket - (hargaTiket * 0.10)); 
                System.out.println("Diskon 10%");
            } else {
                totalHarga = jumlahTiket * hargaTiket; 
                System.out.println("Tidak ada diskon");
            }

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;
            
            System.out.println("Total harga untuk " + jumlahTiket + " tiket: Rp " + totalHarga);           
            System.out.println("Total tiket yang terjual: " + totalTiket + " tiket ");
            System.out.println("Total penjualan tiket hari ini: Rp " + totalPenjualan);
        }
    }
}