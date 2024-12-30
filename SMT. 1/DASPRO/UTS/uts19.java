import java.util.Scanner;
public class uts19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris = 5;
        int kolom = 3;
        
        for (int i=0; i< baris; i++){ 
            int n = i + 1;
            for (int j = 0; j < kolom; j++) {
            System.out.print(n + "\t"); ;
            n += baris;
            }
        System.out.println();
        }     
    } 
} 
