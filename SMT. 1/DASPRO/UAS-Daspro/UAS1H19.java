// Nama = Nadya Aurora Gebi Agista
// NIM = 244107020034
// No. Absen = 19

import java.util.Scanner;

public class UAS1H19 {
    public static void input(String[] nama19, int[] skor119, int[] skor219, boolean[]dataInput19) {
        int jmlTim19 = 3;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < jmlTim19; i++) {
            System.out.print("Masukkan nama tim ke-" + (i + 1) + " : ");
            nama19[i] = sc.nextLine();

            while (true) {
                System.out.print("Masukkan skor " + nama19[i] + " untuk Level 1: ");
                skor119[i] = sc.nextInt();
                if (skor119[i] >= 0) {
                    if (skor119[i] < 35) {
                        skor119[i] = 0;
                    }
                    break;
                } else {
                    System.out.println("Skor tidak boleh negatif! Silakan ulangi input.");
                }
            }
            while (true) {
                System.out.print("Masukkan skor " + nama19[i] + " untuk Level 2: ");
                skor219[i] = sc.nextInt();
                if (skor219[i] >= 0) {
                    break;
                } else {
                    System.out.println("Skor tidak boleh negatif! Silakan ulangi input.");
                }
            }
            sc.nextLine();
        }
        dataInput19[0] = true; 
    }

    public static void tampilkan(String[] nama19, int[] skor119, int[] skor219, boolean[] dataInput19) {
        if (!dataInput19[0]) {
            System.out.println("Belum ada data yang diinputkan. Silakan input data terlebih dahulu!");
            return;
        }

        System.out.println("Tabel Skor Turnamen");
        System.out.println("Nama Tim\tLevel1\tLevel2\tTotal Skor");

        for (int i = 0; i < 5; i++) {
            int totalSkor19 = skor119[i] + skor219[i];
            
            if (skor119[i] > 50 && skor219[i] > 50) {
                totalSkor19 += 19;
            }
            if (totalSkor19 % 2 == 0) {
                totalSkor19 -= 15;
            }
            System.out.println(nama19[i] + "\t\t" + skor119[i] + "\t" + skor219[i] + "\t" + totalSkor19);
        }
    }

    public static void juara(String[] nama19, int[] skor119, int[] skor219, boolean[] dataInput19) {
        if (!dataInput19[0]) {
            System.out.println("Belum ada data yang diinputkan. Silakan input data terlebih dahulu!");
            return;
        }

        int maxSkor = -1;
        String juara19 = "";
        boolean seri19 = false;

        for (int i = 0; i < 5; i++) {
            int totalSkor19 = skor119[i] + skor219[i];
            
            if (skor119[i] > 50 && skor219[i] > 50) {
                totalSkor19 += 19;
            }
            if (totalSkor19 % 2 == 0) {
                totalSkor19 -= 15;
            }

            if (totalSkor19 > maxSkor) {
                maxSkor = totalSkor19;
                juara19 = nama19[i];
                seri19 = false;
            } else if (totalSkor19 == maxSkor) {
                int skor219Current = skor219[i];
                int skor2Juara = skor219[indexNama(nama19, juara19)];
                if (skor219Current > skor2Juara) {
                    juara19 = nama19[i];
                    seri19 = false;
                } else if (skor219Current == skor2Juara) {
                    if (skor119[i] == skor119[indexNama(nama19, juara19)]) {
                        seri19 = true;
                    }
                }
            }
        }

        if (seri19) {
            System.out.println("Turnamen berakhir seri!");
        } else {
            System.out.println("Selamat kepada Tim " + juara19 + " yang telah memenangkan kompetisi dengan skor " + maxSkor + "!");
        }
    }

    private static int indexNama(String[] nama19, String juara19) {
        for (int i = 0; i < nama19.length; i++) {
            if (nama19[i].equals(juara19)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nama19 = new String[5];
        int[] skor119 = new int[5];
        int[] skor219 = new int[5];
        boolean[] dataInput19 = {false}; 
        int pilihan;

        do {
            System.out.println("=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Data Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    input(nama19, skor119, skor219, dataInput19);
                    break;
                case 2:
                    tampilkan(nama19, skor119, skor219, dataInput19);
                    break;
                case 3:
                    juara(nama19, skor119, skor219, dataInput19);
                    break;
                case 4:
                    System.out.println("Keluar dari program!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        } while (pilihan != 4);
    }
}
