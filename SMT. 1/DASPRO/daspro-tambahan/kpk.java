import java.util.Scanner;

public class kpk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== KPK ==");
        System.out.print("Masukkan bilangan pertama : ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua : ");
        int bil2 = sc.nextInt();

        for (int kpk = bil1; kpk <= bil1 * bil2; kpk++) {
            if (kpk % bil1 == 0 && kpk % bil2 == 0) {
                System.out.println("KPK dari " + bil1 + " dan " + bil2 + " adalah " + kpk);
                break;
            }
        }
    }
}
