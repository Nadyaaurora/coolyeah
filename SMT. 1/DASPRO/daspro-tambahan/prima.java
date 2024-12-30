import java.util.Scanner;

public class prima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== CEK BILANGAN PRIMA ==");
        System.out.print("Masukkan bilangan : ");
        int bil = sc.nextInt();

        if (bil < 2) {
            System.out.println(bil + " adalah bukan bilangan prima");
        } else {
            for (int i = 2; i < bil; i++) {
                if (bil % i == 0) {
                    System.out.println(bil + " adalah bukan bilangan prima");
                    return;
                }
            }
            System.out.println(bil + " adalah bilangan prima");
        }
    }
}
