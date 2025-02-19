import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] matkul = new String[8]; 
        String[] nilaiHuruf = new String[8]; 
        int[] sks = new int[8]; 
        double[] bobotNilai = new double[8]; 

        System.out.println("=================================");
        System.out.println(" Program Menghitung IP Semester");
        System.out.println("=================================");

        double totalBobotSKS = 0, totalSKS = 0; 

        for (int i = 0; i < 8; i++) {
            System.out.print("Masukkan Nama Mata Kuliah " + (i + 1) + " : ");
            matkul[i] = sc.nextLine(); 
            System.out.print("Masukkan bobot SKS : ");
            sks[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan Nilai Huruf : ");
            nilaiHuruf[i] = sc.nextLine(); 
            System.out.println("------------------------------");
         
            if (nilaiHuruf[i].equals("A")) {
                bobotNilai[i] = 4.0;
            } else if (nilaiHuruf[i].equals("B+")) {
                bobotNilai[i] = 3.5;
            } else if (nilaiHuruf[i].equals("B")) {
                bobotNilai[i] = 3.0;
            } else if (nilaiHuruf[i].equals("C+")) {
                bobotNilai[i] = 2.5;
            } else if (nilaiHuruf[i].equals("C")) {
                bobotNilai[i] = 2.0;
            }else if (nilaiHuruf[i].equals("D")) {
               bobotNilai[i] = 1.0;
            } else {
                bobotNilai[i] = 0.0;
            }
            totalBobotSKS += bobotNilai[i] * sks[i]; 
            totalSKS += sks[i]; 
        }
        double ipSemester = totalBobotSKS / totalSKS;

        System.out.println("=====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=====================");
        System.out.printf("%-25s %-12s %-12s %-12s\n", "Mata Kuliah", "SKS", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < 8; i++) {
            System.out.printf("%-25s %-12d %-12s %-12.2f\n", matkul[i], sks[i], nilaiHuruf[i], bobotNilai[i]);
        }
        System.out.println("=====================");
        System.out.printf("IP : %.2f\n", ipSemester); 
    }
}

