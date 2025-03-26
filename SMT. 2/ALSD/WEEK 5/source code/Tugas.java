public class Tugas {
    String nama;
    int nim, tahunMasuk, nilaiUTS, nilaiUAS;

    public Tugas(String nama, int nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Divide and Conquer untuk mencari nilai UTS tertinggi
    public static int utsTertinggi(int[] uts, int left, int right) {
        if (left == right) {
            return uts[left];
        }
        int mid = (left + right) / 2;
        int maxL = utsTertinggi(uts, left, mid);
        int maxR = utsTertinggi(uts, mid + 1, right);

        if (maxL > maxR) {
            return maxL;
        } else {
            return maxR;
        }
    }

    // Divide and Conquer untuk mencari nilai UTS terendah
    public static int utsTerendah(int[] uts, int left, int right) {
        if (left == right) {
            return uts[left];
        }
        int mid = (left + right) / 2;
        int minL = utsTerendah(uts, left, mid);
        int minR = utsTerendah(uts, mid + 1, right);

        if (minL < minR) {
            return minL;
        } else {
            return minR;
        }
    }

    // Brute Force untuk menghitung rata-rata nilai UAS
    public static double rerataUAS(int[] uas) {
        int total = 0;
        for (int nilai : uas) {
            total += nilai;
        }
        return (double) total / uas.length;
    }
}
