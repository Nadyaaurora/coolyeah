import java.util.Scanner;
public class Tugas4 {
    static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    static void outputFibonacci(int n, int i) {
        if (i > n) {
            return;
        }
        System.out.print(fibonacci(i) + " ");
        outputFibonacci(n, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka ke-n: ");
        int n = sc.nextInt();
        System.out.print("Deret Fibonacci ke-" + n + " : ");
        outputFibonacci(n, 1);
        System.out.println();
    }
}
