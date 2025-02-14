import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] kode = {"A", "B", "D", "E", "F", "L", "N", "T", "AD", "DK"};
        String[] kota = {
            "Banten", "Jakarta", "Bandung", "Cirebon", "Bogor",
            "Surabaya", "Malang", "Karawang", "Yogyakarta", "Bali"
        };
        
        System.out.print("Masukkan kode plat nomor: ");
        String plat = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i].equalsIgnoreCase(plat)) {
                System.out.println("Kota: " + kota[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
