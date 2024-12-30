import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double penggunaanListrik, totalTagihan;
        int tarifListrik = 1500;
        System.out.print("Masukkan penggunaan listrik (kWh): ");
        penggunaanListrik = input.nextDouble();
        boolean melebihi500kWh =( penggunaanListrik>500);
        System.out.println("apakah penggunaan listrik anda melebihi 500kWh? (true/false) " + melebihi500kWh);

        totalTagihan = (tarifListrik * penggunaanListrik);

        System.out.println("Total Tagihan: " + totalTagihan);
    }
}
