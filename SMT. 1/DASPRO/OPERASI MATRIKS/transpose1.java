import java.util.Scanner;

public class transpose1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        int[][] matriks = new int[baris][kolom];
        int[][] transpose = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                for (int k = 0; k < baris; k++){
                transpose[i][j] = matriks[j][i];
                }
            }
        }
        System.out.println("Hasil perkalian adalah ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
