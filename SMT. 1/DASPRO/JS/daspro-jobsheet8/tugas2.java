import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah politeknik yang mendaftar : ");
        int jmlPoliteknik = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= jmlPoliteknik; i++) {
            System.out.print("Masukkan nama politeknik ke-" + i + " : ");
            String namaPoliteknik = sc.nextLine();

            System.out.print("Masukkan jumlah cabang olahraga : ");
            int jmlCabor = sc.nextInt();
            System.out.println("\nPoliteknik: " + namaPoliteknik);
            sc.nextLine();

            for (int j = 1; j <= jmlCabor; j++) {
                System.out.print("Masukkan nama cabor ke-" + j + " : ");
                String namaCabor = sc.nextLine();
                String daftarAtlet = "";

                for (int k = 1; k <= 5; k++) {
                    System.out.print("Nama atlet ke-" + k + " : ");
                    String namaAtlet = sc.nextLine();
                    if (k <= 5) {
                        daftarAtlet += "- " + namaAtlet + "\n"; 
                    }
                }

                System.out.println("Nama atlet " + namaCabor + " :");
                System.out.println(daftarAtlet);
            }
        }
    }
}
