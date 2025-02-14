import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean next = true;

        while (next) {
            System.out.println("==== KALKULATOR KUBUS ====");
            System.out.println("1. Volume Kubus");
            System.out.println("2. Luas Permukaan Kubus");
            System.out.println("3. Keliling Kubus");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();

            System.out.print("Masukkan panjang sisi kubus: ");
            double sisi = sc.nextDouble();

            switch (pilihan) {
                case 1:
                    System.out.println("Volume Kubus: " + (sisi * sisi * sisi));
                    break;
                case 2:
                    System.out.println("Luas Permukaan Kubus: " + (6 * sisi * sisi));
                    break;
                case 3:
                    System.out.println("Keliling Kubus: " + (12 * sisi));
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.print("Apakah ingin menghitung lagi? (ya/tidak): ");
            String jawaban = sc.next();
            if (jawaban.equalsIgnoreCase("tidak")) {
                next = false;
            }
        }
    }
}
