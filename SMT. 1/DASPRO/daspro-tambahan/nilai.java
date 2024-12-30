import java.util.Scanner;
public class nilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai[][] = new double[3][5];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan nilai untuk mahasiswa ke- " + (i + 1) + " :");
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print("Nilai ke- " + (j + 1) + " : ");
                nilai[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < nilai.length; i++) {
            double total = 0;
            for (int j = 0; j < nilai[0].length; j++) {
                total += nilai[i][j];
            }
            double rata = total / nilai[0].length;
            System.out.println("Rata-rata mahasiswa ke- " + (i + 1) + " : " + rata);
        }
    }
}
