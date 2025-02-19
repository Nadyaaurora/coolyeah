public class Fungsi {
    public static void main(String[] args) {
        int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] harga = {75000, 50000, 60000, 10000};
        int[] bungaMati = {-1, -2, 0, -5}; 

        hitungPendapatan(stock, harga);
        updateStock(stock[3], bungaMati);
    }
    public static void hitungPendapatan(int[][] stock, int[] harga) {
        System.out.println("Pendapatan setiap cabang jika semua bunga terjual :");
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                pendapatan += stock[i][j] * harga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + " : Rp." + pendapatan);
        }
    }
    public static void updateStock(int[] stockCabang, int[] bungaMati) {
        System.out.println("\nStok cabang RoyalGarden 4 setelah bunga mati :");
        for (int i = 0; i < stockCabang.length; i++) {
            stockCabang[i] += bungaMati[i];
        }
        System.out.println("Aglonema : " + stockCabang[0]);
        System.out.println("Keladi   : " + stockCabang[1]);
        System.out.println("Alocasia : " + stockCabang[2]);
        System.out.println("Mawar    : " + stockCabang[3]);
    }
}
