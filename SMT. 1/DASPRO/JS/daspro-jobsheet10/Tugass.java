import java.util.Scanner;
public class Tugass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] a = new int[10][6];
        double[] rerataResponden = new double[10];
        double[] rerataPertanyaan = new double[6];
        int jmlPertanyaan, jmlRespon, jmlSeluruh = 0;

        for (int i = 0; i < a.length; i++) {
            jmlPertanyaan = 0;
            for (int j = 0; j < a[0].length; ) {
                System.out.print("Masukkan nilai untuk a[" + i + "][" + j + "] (1-5): ");
                a[i][j] = scanner.nextInt(); 
                
                if (a[i][j] >= 1 && a[i][j] <= 5) { 
                    jmlPertanyaan += a[i][j]; 
                    j++; 
                } else {
                    System.out.println("Nilai tidak valid");
                }
            }
                rerataResponden[i] = (double) jmlPertanyaan / 6;
                System.out.println("=== RATA-RATA RESPONDEN ====");
                System.out.println("Rata-rata responden " + i + ": " + rerataResponden[i]);
                System.out.println();
        }
       
        System.out.println("=== RATA-RATA PERTANYAAN ====");
        for (int j = 0; j < a[0].length; j++) {
            jmlRespon = 0;
            for (int i = 0; i < a.length; i++) {
                jmlRespon += a[i][j];
            }
            rerataPertanyaan[j] = (double) jmlRespon / 2;
            System.out.println("Rata-rata pertanyaan " + j + ": " + rerataPertanyaan[j]);
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                jmlSeluruh += a[i][j];
            }
        }
        double rerataSeluruh = (double) jmlSeluruh / (10 * 6);
        System.out.println();
        System.out.println("==== RATA-RATA SELURUH ====");
        System.out.println("Rata-rata seluruh: " + rerataSeluruh);
    }
}


