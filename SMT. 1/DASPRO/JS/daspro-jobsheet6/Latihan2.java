import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku, diskon, tambahanDiskon, totalDiskon;

        System.out.print("Masukkan jenis buku :");
        jenisBuku = input19.nextLine();
        System.out.print("Masukkan jumlah buku :");
        jumlahBuku = input19.nextInt();
        
            if (jenisBuku.equalsIgnoreCase("kamus")) {
                diskon = 10;
                if (jumlahBuku > 2) {
                    tambahanDiskon = 2;
                    totalDiskon = diskon + tambahanDiskon;
                    System.out.println("Total diskon sebesar " + totalDiskon + " % " );
                }
            } else if (jenisBuku.equalsIgnoreCase("novel")) {
                diskon = 7;
                if (jumlahBuku > 3) {
                    tambahanDiskon = 2;
                    totalDiskon = diskon + tambahanDiskon;
                    System.out.println("Total diskon sebesar " + totalDiskon + " % " );
                }else {
                    tambahanDiskon = 1;
                    totalDiskon = diskon + tambahanDiskon;
                    System.out.println("Total diskon sebesar " + totalDiskon + " % " );
                } 
            }else {
                if (jumlahBuku > 3) {
                diskon = 5;
                System.out.println("Total diskon sebesar " + diskon + " % ");
            }
        }
    }
}
