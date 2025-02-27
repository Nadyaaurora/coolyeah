public class Dosen19 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen19() {

    }

    public Dosen19(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("\n=====================================");
        System.out.println("          INFORMASI DOSEN            ");
        System.out.println("=====================================");
        System.out.println("ID Dosen         : " + idDosen);
        System.out.println("Nama Dosen       : " + nama);
        System.out.println("Status Aktif     : " + statusAktif);
        System.out.println("Tahun Bergabung  : " + tahunBergabung);
        System.out.println("Bidang Keahlian  : " + bidangKeahlian);
        System.out.println("=====================================");
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("\n[INFO] Status aktif dosen telah diubah.");
    }

    int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunBergabung;
    }

    void ubahKeahlian(String bidangKeahlianBaru) {
        bidangKeahlian = bidangKeahlianBaru;
        System.out.println("\n[INFO] Bidang keahlian telah diubah.");
    }
}
