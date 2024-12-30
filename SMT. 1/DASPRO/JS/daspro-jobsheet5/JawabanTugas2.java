import java.util.Scanner;
public class JawabanTugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int usia;
        String kategoriUsia;

        System.out.print("Masukkan usia: ");
        usia = sc.nextInt(); 
        if (usia >= 0 && usia <= 12) {
            kategoriUsia = "Anak";
        } else if (usia >= 13 && usia <= 19) {
            kategoriUsia = "Remaja";
        } else if (usia >= 20 && usia <= 60) {
            kategoriUsia = "Dewasa";
        } else if (usia > 60) {
            kategoriUsia = "Lansia";
        } else {
            kategoriUsia = "Tidak Valid"; 
        }
        
        System.out.println(usia + " adalah kategori " + kategoriUsia);
    }
}
