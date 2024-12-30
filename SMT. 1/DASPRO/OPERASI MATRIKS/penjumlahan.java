import java.util.Scanner;

public class penjumlahan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = scanner.nextInt();

        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("Masukkan elemen matriks pertama:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("matriks1[" + i + "][" + j + "]: ");
                matriks1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Masukkan elemen matriks kedua:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("matriks2[" + i + "][" + j + "]: ");
                matriks2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }

        System.out.println("Hasil pengurangan matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
