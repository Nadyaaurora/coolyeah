import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jamKerja;
        double upahPerJam, totalGajiSebelumPajak, gajiBonus, gajiSetelahPajak;
        
        System.out.print("Masukkan jumlah jam kerja: ");
        jamKerja = input.nextInt();
        System.out.print("Masukkan upah per jam:");
        upahPerJam = input.nextDouble();

        totalGajiSebelumPajak = (jamKerja * upahPerJam);
        gajiBonus = totalGajiSebelumPajak + (totalGajiSebelumPajak * 0.10);
        gajiSetelahPajak = gajiBonus - (gajiBonus * 0.05);

        System.out.println("Total gaji sebelum pajak: " + totalGajiSebelumPajak);
        System.out.println("Gaji Bonus:" + gajiBonus);
        System.out.println("Total gaji setelah pajak: " + gajiSetelahPajak);
    }
}
