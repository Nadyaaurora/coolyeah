import java.util.Scanner;
public class Tugas2 {
    static int hitung(int n) {
        if (n == 1) {
            System.out.print("1");
            return 1; 
        } else {
            int hasil = hitung(n-1); 
            System.out.print( " + " + n);
            return hasil + n;
        }
    }

    public static void main(String[] args) {
        System.out.println("f = 8");
        System.out.println("Hasil penjumlahan : ");
        System.out.print(" = " + hitung(8));
    }
}
