import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Volume Kubus");
            System.out.println("2. Luas Permukaan Kubus");
            System.out.println("3. Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();

            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisi = sc.nextDouble();

                switch (pilihan) {
                    case 1:
                        volume(sisi);
                        break;
                    case 2:
                        luasPermukaan(sisi);
                        break;
                    case 3:
                        keliling(sisi);
                        break;
                }
            } else if (pilihan == 4) {
                System.out.println("Keluar dari program!");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
            System.out.print("Apakah ingin menghitung lagi? (y/n): ");
        } while (sc.next().equalsIgnoreCase("y"));
        System.out.println("Terima kasih! Program selesai.");
    }

    static void volume(double sisi) {
        double volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus: " + volume);
    }

    static void luasPermukaan(double sisi) {
        double luasPermukaan = 6 * sisi * sisi;
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
    }

    static void keliling(double sisi) {
        double keliling = 12 * sisi;
        System.out.println("Keliling Kubus: " + keliling);
    }
}