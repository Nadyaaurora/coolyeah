import java.util.Scanner;
public class waktu {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("== KONVERSI WAKTU ==");
        System.out.print("Masukkan waktu dalam detik : ");
        int totalDetik = sc.nextInt();

        int jam = totalDetik / 3600;
        int menit = (totalDetik % 3600) / 60;
        int detik = totalDetik % 60;

        System.out.println(jam + " jam : " + menit + " menit : " + detik + " detik" );
    }
}