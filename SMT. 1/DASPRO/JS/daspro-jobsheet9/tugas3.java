import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        String[] menu = {
            "Nasi Goreng", 
            "Mie Goreng", 
            "Roti Bakar", 
            "Kentang Goreng", 
            "Teh Tarik", 
            "Cappucino", 
            "Chocolate Ice"
        };

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nama makanan yang ingin dicari: ");
        String namaMakanan = scanner.nextLine();

        boolean ditemukan = false; 
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(namaMakanan)) {
                ditemukan = true; 
                break; 
            }
        }
        if (ditemukan) {
            System.out.println( namaMakanan + " tersedia di menu.");
        } else {
            System.out.println( namaMakanan + " tidak ditemukan di menu.");
        }
    }
}