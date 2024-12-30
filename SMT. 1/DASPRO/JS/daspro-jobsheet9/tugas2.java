import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Masukkan jumlah pesanan: "); 
      int jmlhPesanan = sc.nextInt();
      sc.nextLine();

      double totalBiaya = 0;
      double hargaPesanan = 0;
      String namaPesanan;
      
      System.out.println("----- DAFTAR PESANAN -----");
      System.out.println("--------------------------");
      for (int i = 0; i < jmlhPesanan; i++) {
        System.out.print("Nama pesanan ke- " + (i+1)+ ": ");
        namaPesanan =sc.nextLine();

        System.out.print("Harga " + namaPesanan + ": ");
        hargaPesanan = sc.nextDouble();
        sc.nextLine();

        totalBiaya += hargaPesanan;
      }
      System.out.println("------------------------------");
      System.out.println("Total Biaya\t" + (totalBiaya));
      System.out.println("------------------------------");
    }
}
