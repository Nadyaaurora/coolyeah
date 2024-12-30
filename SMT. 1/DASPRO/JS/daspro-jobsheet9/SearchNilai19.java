import java.util.Scanner;
public class SearchNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak nilai yang akan diinput: "); 
        int nilai = sc.nextInt();
        int[] nilaiMhs = new int[nilai];

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (key == nilaiMhs[i]) {
                hasil = i + 1;
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
                break;
            }
        }
        if (hasil == 0) {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        System.out.println();
    }
}

