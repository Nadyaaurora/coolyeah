import java.util.Scanner;
public class Kubus19{

        //Fungsi volumeKubus
        static int volumeKubus (int sisi) {
            int volume = sisi*sisi*sisi;
            return volume;
        }
        //Fungsi luasPermukaan
        static int luasPermukaan (int sisi) {
            int lp = 6*sisi*sisi;
            return lp;
        }
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            int sisi, vol, lp;
            System.out.print("Masukkan sisi kubus: ");
            sisi = input.nextInt();

            vol = volumeKubus(sisi);
            System.out.println("Volume Kubus adalah " + vol);
            
            lp = luasPermukaan(sisi);
            System.out.println("Luas Permukaan Kubus adalah " + lp);
        }
    }