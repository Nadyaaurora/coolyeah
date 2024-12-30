import java.util.Scanner;
public class Kuisdaspro {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int berasKantong, jumlahPenduduk, berasDibagikan, jumlahKantongBeras, totalBeratBeras;

        System.out.print("Masukkan berat beras per kantong (kg): ");
        berasKantong = input.nextInt();
        System.out.print("Masukkan jumlah penduduk: ");
        jumlahPenduduk = input.nextInt();
        System.out.print("Masukkan ketentuan berat beras per orang: ");
        berasDibagikan = input.nextInt();

        totalBeratBeras = (jumlahPenduduk * berasDibagikan);
        jumlahKantongBeras = (totalBeratBeras / berasKantong);

        System.out.println("Jumlah kantong beras yang dibutuhkan :" + jumlahKantongBeras);
    }
}
