import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] matkul = new String[8];
        String[] nilaiHuruf = new String[8];
        int[] sks = new int[8];
        double[] bobotNilai = new double[8];

        System.out.println("=================================");
        System.out.println(" Program Menghitung IP Semester ");
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

            switch (nilaiHuruf[i]) {
                case "A":
                    bobotNilai[i] = 4.0;
                    break;
                case "B+":
                    bobotNilai[i] = 3.5;
                    break;
                case "B":
                    bobotNilai[i] = 3.0;
                    break;
                case "C+":
                    bobotNilai[i] = 2.5;
                    break;
                case "C":
                    bobotNilai[i] = 2.0;
                    break;
                case "D":
                    bobotNilai[i] = 1.0;
                    break;
                default:
                    bobotNilai[i] = 0.0;
            }
            totalBobotSKS += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }
        double ipSemester = totalBobotSKS / totalSKS;

        System.out.println("===========================================");
        System.out.println("            Hasil Konversi Nilai           ");
        System.out.println("===========================================");
        System.out.printf("%-40s %-5s %-12s %-10s\n", "Mata Kuliah", "SKS", "Nilai Huruf", "Bobot Nilai");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < 8; i++) {
            System.out.printf("%-40s %-5d %-12s %-10.2f\n", matkul[i], sks[i], nilaiHuruf[i], bobotNilai[i]);
        }
        System.out.println("========================================================");
        System.out.printf("IP Semester : %.2f\n", ipSemester);
    }
}