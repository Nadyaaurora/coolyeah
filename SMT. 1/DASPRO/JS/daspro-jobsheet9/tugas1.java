import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak nilai yang akan diinput: "); 
        int nilai = sc.nextInt();
        int[] nilaiMhs = new int[nilai];
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);
        

        int max = nilaiMhs[0];
        int min = nilaiMhs[0];

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];

        if (nilaiMhs[i] > max) {
            max = nilaiMhs[i];
        }
        if (nilaiMhs[i] < min) {
            min = nilaiMhs[i];
        }
    }
    System.out.println ("Nilai tertinggi = " + max);
    System.out.println ("Nilai terendah = " + min);
    }
}

