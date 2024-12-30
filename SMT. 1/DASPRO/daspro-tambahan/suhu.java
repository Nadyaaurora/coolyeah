import java.util.Scanner;
public class suhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== KONVERSI CELCIUS KE FAHRENHEIT == ");
        System.out.print("Masukkan suhu dalam celcius : ");
        double celcius = sc.nextDouble();
        double fahrenheit = ((9 * celcius) / 5) + 32;
        System.out.println(celcius + "°C = " + fahrenheit + "°F");
    }
}
