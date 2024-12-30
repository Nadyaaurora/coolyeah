import java.util.Scanner;
public class nomor2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenisKendaraan, durasi, tarifPerJam, pembayaran, totalPembayaran = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }
            tarifPerJam = 0;
            if (jenisKendaraan == 1){
                tarifPerJam = 3000;
            } else if (jenisKendaraan == 2){
                tarifPerJam = 2000;
            }

            System.out.print("Input durasi (dalam jam): ");
            durasi = sc.nextInt();
            pembayaran = 0;
            if (durasi <= 5) {
                pembayaran = tarifPerJam * durasi;
            } else {
                pembayaran = 12500;
            }

            totalPembayaran += pembayaran;
            
            System.out.println("Pembayaran: Rp" + pembayaran);
            }
       
         System.out.println("Total pembayaran parkir: Rp " + totalPembayaran);
    }
}
