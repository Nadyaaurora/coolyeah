import java.util.Scanner;

public class bilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama : ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua   : ");
        int bil2 = sc.nextInt();
        System.out.print("Masukkan bilangan ketiga  : ");
        int bil3 = sc.nextInt();

        int terbesar, tengah, terkecil;
        if (bil1 > bil2 && bil1 > bil3) {
            terbesar = bil1;
            if (bil2 > bil3) {
                tengah = bil2;
                terkecil = bil3;
            } else {
                tengah = bil3;
                terkecil = bil2;
            }
        } else if (bil2 > bil1 && bil2 > bil3) {
            terbesar = bil2;
            if (bil1 > bil3) {
                tengah = bil1;
                terkecil = bil3;
            } else {
                tengah = bil3;
                terkecil = bil1;
            }
        } else {
            terbesar = bil3;
            if (bil1 > bil2) {
                tengah = bil1;
                terkecil = bil2;
            } else {
                tengah = bil2;
                terkecil = bil1;
            }
        }
        System.out.println("== URUTAN BILANGAN ==");
        System.out.println(terkecil + " " + tengah + " " + terbesar);
    }
}

