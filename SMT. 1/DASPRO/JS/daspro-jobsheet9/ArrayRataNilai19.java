import java.util.Scanner;
public class ArrayRataNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: "); 
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rerataLulus, rerataTidakLulus;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            }else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }
        rerataLulus = totalLulus / jumlahLulus;
        rerataTidakLulus = totalTidakLulus / jumlahTidakLulus;
        System.out.println("Rata-rata nilai lulus = " + rerataLulus);
        System.out.println("Rata-rata nilai yang tidak lulus = " + rerataTidakLulus);
    }
}


