import java.util.Scanner;

public class mahasiswa {
    public static int[][] nilaiTugas; 
    public static String[] namaMahasiswa; 
    public static String[] tugas; 

    // Input 
    public static void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = sc.nextInt();
        sc.nextLine(); 

        namaMahasiswa = new String[jumlahMahasiswa];
        tugas = new String[jumlahTugas];
        nilaiTugas = new int[jumlahMahasiswa][jumlahTugas];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = sc.nextLine();
        }
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan nilai tugas untuk mahasiswa " + namaMahasiswa[i] + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Nilai tugas ke-" + (j + 1) + ": ");
                nilaiTugas[i][j] = sc.nextInt();
            }
        }
    }
    public static void outputNilai() {
        System.out.println("\nData Nilai Tugas Mahasiswa:");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print(namaMahasiswa[i] + " : ");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print(nilaiTugas[i][j]);
                if (j < nilaiTugas[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
    public static void rerataNilai() {
        System.out.println("\nRata-rata Nilai Tugas Mahasiswa:");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            int totalNilai = 0;
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                totalNilai += nilaiTugas[i][j];
            }
            double rataRata = totalNilai / (double) nilaiTugas[i].length;
            System.out.println(namaMahasiswa[i] + " : " + rataRata);
        }
    }
    public static void nilaiTertinggi() {
        System.out.println("\nNilai Tertinggi per Tugas:");
        for (int j = 0; j < tugas.length; j++) {
            int nilaiTertinggi = -1;
            String mahasiswaMax = "";
            for (int i = 0; i < namaMahasiswa.length; i++) {
                if (nilaiTugas[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiTugas[i][j];
                    mahasiswaMax = namaMahasiswa[i];
                }
            }
            System.out.println("Tugas ke-" + (j + 1) + " : " + mahasiswaMax + " dengan nilai " + nilaiTertinggi);
        }
    }

    public static void main(String[] args) {
        inputData(); 
        outputNilai(); 
        rerataNilai();
        nilaiTertinggi(); 
    }
}
