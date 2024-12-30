import java.util.Scanner;
public class Penjualan19 {
    public static int[][] penjualan ={
            {20, 20, 25, 20, 10, 60,10},
            {30, 80, 40, 10, 15, 20, 25},
            {5, 9, 20, 25, 10, 5, 45},
            {50, 8, 17, 18, 10, 30, 6},
            {15, 10, 16, 15, 10, 10, 55} 
        };
    public static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    
    // input
    public static void inputData(int[][] dataPenjualan) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu " + menu[i]+ ": ");
            for (int j = 0; j < penjualan.length; j++) {
                System.out.print("Hari ke-" + (j+1) + ": ");
                dataPenjualan[i][j] = sc.nextInt();
            }
        }
    }

    public static void outputPenjualan(int[][] dataPenjualan) {
        System.out.println("\nData Penjualan ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]+ ": ");
            for (int j = 0; j < penjualan.length; j++) {
                System.out.print(dataPenjualan[i][j]);
            }
        System.out.println();
        }
    }

    public static void menuTertinggi(int[][] dataPenjualan) {
        int maxPenjualan = 0;
        String menuTertinggi = "";
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan.length; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi adalah " + menuTertinggi + " dengan total penjualan " + maxPenjualan);
    }
    public static void rerataPenjualan(int[][] dataPenjualan) {
        System.out.println("\nRata-rata penjualan untuk setiap menu");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan.length; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }
            double rataRata = totalPenjualan / 7.0;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }
    public static void main(String[] args) {
        outputPenjualan(penjualan);
        menuTertinggi(penjualan);
        rerataPenjualan(penjualan);
    }
}
        
    