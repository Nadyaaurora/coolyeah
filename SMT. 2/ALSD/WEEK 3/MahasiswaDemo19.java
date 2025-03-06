import java.util.Scanner;
public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Mahasiswa19[] arrayOfMahasiswa = new Mahasiswa19[3];
        String dummy;
        
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa19();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM      : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();    
            System.out.print("NAMA     : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("KELAS    : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK      : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------------");
        }
            arrayOfMahasiswa[0].cetakInfo();
            arrayOfMahasiswa[1].cetakInfo();
            arrayOfMahasiswa[2].cetakInfo();
        }
    }
