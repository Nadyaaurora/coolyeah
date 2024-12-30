import java.util.Scanner;

public class programKu {
    public static int[][] penjualan;
    public static String[] menu;

    // Input 
    public static void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine();

        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][7];

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Masukkan data penjualan untuk menu " + menu[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
    // Output
    public static void outputPenjualan() {
        System.out.println("Data Penjualan");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + " : ");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j]);
                if (j < penjualan[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
    public static void rerataPenjualan() {
        System.out.println("\nRata-rata Penjualan");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = totalPenjualan / 7.0;
            System.out.println(menu[i] + " : " + rataRata);
        }
    }
    public static void main(String[] args) {
        inputData();
        outputPenjualan();
        rerataPenjualan();
    }
}
