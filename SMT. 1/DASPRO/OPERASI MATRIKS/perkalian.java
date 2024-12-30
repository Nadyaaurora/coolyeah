import java.util.Scanner;
public class perkalian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris matriks pertama: ");
        int baris1 = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks pertama (atau baris matriks kedua): ");
        int kolom1 = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks kedua: ");
        int kolom2 = sc.nextInt();

        int[][] matriks1 = new int[baris1][kolom1];
        int[][] matriks2 = new int[kolom1][kolom2];
        int[][] hasil = new int[baris1][kolom2];

        System.out.println("Masukkan elemen matriks pertama:");
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom1; j++) {
                System.out.print("matriks1[" + i + "][" + j + "]: ");
                matriks1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Masukkan elemen matriks kedua:");
        for (int i = 0; i < kolom1; i++) {
            for (int j = 0; j < kolom2; j++) {
                System.out.print("matriks2[" + i + "][" + j + "]: ");
                matriks2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom2; j++) {
                for (int k = 0; k < kolom1; k++) {
                    hasil[i][j] += matriks1[i][k] * matriks2[k][j];
                }
            }
        }
        System.out.println("Hasil perkalian matriks:");
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom2; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
