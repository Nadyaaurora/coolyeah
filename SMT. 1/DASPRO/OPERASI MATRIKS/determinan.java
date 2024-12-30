import java.util.Scanner;

public class determinan {    
    public static int determinan2x2(int[][] matriks) {
        return matriks[0][0] * matriks[1][1] - matriks[0][1] * matriks[1][0];
    }
    public static int determinan3x3(int[][] matriks) {
        int a = matriks[0][0], b = matriks[0][1], c = matriks[0][2];
        int d = matriks[1][0], e = matriks[1][1], f = matriks[1][2];
        int g = matriks[2][0], h = matriks[2][1], i = matriks[2][2];
        return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan ukuran matriks (2x2 atau 3x3): ");
        int n = sc.nextInt();  

        int[][] matriks = new int[n][n];

        System.out.println("Masukkan elemen-elemen matriks:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriks[i][j] = sc.nextInt();
            }
        }

        if (n == 2) {
            System.out.println("Determinan matriks 2x2 adalah: " + determinan2x2(matriks));
        } else if (n == 3) {
            System.out.println("Determinan matriks 3x3 adalah: " + determinan3x3(matriks));
        } else {
            System.out.println("Ukuran matriks tidak didukung.");
        }
    }
}
