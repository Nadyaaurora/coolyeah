import java.util.Scanner;
public class kuis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris matriks : ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks : ");
        int kolom = sc.nextInt();

        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("Masukkan elemen matriks pertama:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Masukkan elemen matriks kedua:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
        System.out.println("Hasil penjumlahan matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}

