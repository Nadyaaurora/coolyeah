import java.util.Scanner;
public class chalenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Matriks Pertama ");
        System.out.print("Masukkan jumlah baris matriks : ");
        int baris1 = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks : ");
        int kolom1 = sc.nextInt();

        
        System.out.println("Matriks Kedua ");
        System.out.print("Masukkan jumlah baris matriks : ");
        int baris2 = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks : ");
        int kolom2 = sc.nextInt();

        int[][] matriks1 = new int[baris1][kolom1];
        int[][] matriks2 = new int[baris2][kolom2];

        System.out.println("Masukkan elemen matriks pertama:");
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom1; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Masukkan elemen matriks kedua:");
        for (int i = 0; i < baris2; i++) {
            for (int j = 0; j < kolom2; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Hasil penjumlahan matriks:");
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom1; j++) {
                System.out.print(matriks1[i][j] + " ");
            } if (baris1 == 3 && kolom1 == 3) {
                if (i == 1) {
                System.out.print("+ ");
            } else {
                System.out.print(" ");
            }
            for (int j = 0; j < kolom2; j++) {
                System.out.print(matriks2[i][j] + "  ");
            } if (baris2 == 3 && kolom2 == 3) {
                if ( i == 1) {
                System.out.print("= ");
                } else {
                System.out.print(" ");
            }
        
            for (int j = 0; j < kolom2; j++) {
                System.out.print(matriks1[i][j] + matriks2[i][j] + " ");
            }
            System.out.println();
                }
            }
        }
    }
}

