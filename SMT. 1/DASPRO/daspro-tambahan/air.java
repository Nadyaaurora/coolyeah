import java.util.Scanner;
public class air {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah air PAM (m kubik) : ");
        int jmlKubik = sc.nextInt();
        int harga = 0;

        if (jmlKubik <= 50) {
            harga = jmlKubik *  1000; 
        } else if (jmlKubik > 50 && jmlKubik <= 100) {
            harga = (50 * 1000) + ((jmlKubik - 50)*1500);
        } else if (jmlKubik > 100 && jmlKubik <= 150) {
            harga = (50 * 1000) + (50 * 1500) + ((jmlKubik - 100) * 2000);
        } else {
            harga = (50 * 1000) + (50 * 1500) + (50 * 2000) + ((jmlKubik - 150) * 3000);
        }
        System.out.println("Jumlah pemakaian : " + jmlKubik + " m kubik");
        System.out.println("Total tagihan yang harus dibayar : Rp " + harga);
    }    
}
