public class DosenMain19 {
    public static void main(String[] args) {
        Dosen19 d1 = new Dosen19();
        d1.idDosen = "D010";
        d1.nama = "Prof. Andi";
        d1.statusAktif = true;
        d1.tahunBergabung = 2015;
        d1.bidangKeahlian = "Dasar Pemograman";

        d1.tampilInformasi();
        d1.setStatusAktif(false);
        d1.ubahKeahlian("Sistem Informasi");
        System.out.println("\nMasa kerja: " + d1.hitungMasaKerja(2025) + " tahun");
        d1.tampilInformasi();

        Dosen19 d2 = new Dosen19("D020", "Prof. Budi Santoso", true, 2010, "Jaringan Komputer");

        d2.tampilInformasi();
        d2.ubahKeahlian("Bahasa Inggris");
        System.out.println("\nMasa kerja: " + d2.hitungMasaKerja(2020) + " tahun");
        d2.tampilInformasi();
    }
}
