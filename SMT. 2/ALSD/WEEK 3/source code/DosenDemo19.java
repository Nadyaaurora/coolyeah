import java.util.Scanner;
public class DosenDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen19[] daftarDosen = new Dosen19[3];
        String kode, nama;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String gender = sc.nextLine();
            jenisKelamin = gender.equalsIgnoreCase("L");
            System.out.print("Usia          : ");
            usia = sc.nextInt();
            sc.nextLine();
            System.out.println("------------------------------------");

            daftarDosen[i] = new Dosen19(kode, nama, jenisKelamin, usia);
        }

        int i = 1;
        for (Dosen19 dosen : daftarDosen) {
            System.out.println("Data Dosen ke-" + i);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.print("Jenis Kelamin : ");
            if (dosen.jenisKelamin) {
                System.out.println("Pria");
            } else {
                System.out.println("Wanita");
            }
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("------------------------------------");
            i++;
        }
    }
}