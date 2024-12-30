import java.util.Scanner;
public class PemilihanBilangan19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        String hasil;
        hasil = (angka % 2 == 0) ? " termasuk bilangan genap " : " termasuk bilangan ganjil ";
        System.out.println("Angka " + angka + hasil);
    }
}