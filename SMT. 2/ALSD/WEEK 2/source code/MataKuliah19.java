public class MataKuliah19 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah19() {
    }

    public MataKuliah19(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("\n=====================================");
        System.out.println("         INFORMASI MATA KULIAH       ");
        System.out.println("=====================================");
        System.out.println("Kode Mata Kuliah  : " + kodeMK);
        System.out.println("Nama Mata Kuliah  : " + nama);
        System.out.println("Jumlah SKS        : " + sks);
        System.out.println("Jumlah Jam        : " + jumlahJam);
        System.out.println("=====================================");
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("\n[INFO] SKS berhasil diubah menjadi " + sks);
    }

    void tambahJam(int jumlahJamBaru) {
        jumlahJam += jumlahJamBaru;
        System.out.println("\n[INFO] Penambahan jam berhasil. Jumlah jam sekarang: " + jumlahJam);
    }

    void kurangiJam(int jumlahJamBaru) {
        if (jumlahJam >= jumlahJamBaru) {
            jumlahJam -= jumlahJamBaru;
            System.out.println("[INFO] Pengurangan jam berhasil. Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("\n[ERROR] Jumlah jam tidak cukup untuk dikurangi!");
        }
    }
}
