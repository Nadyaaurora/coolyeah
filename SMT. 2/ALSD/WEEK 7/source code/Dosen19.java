public class Dosen19 {
    String nama;
    String nidn;
    int usia;
    String matkul;

    public Dosen19(String nama, String nidn, int usia, String matkul) {
        this.nama = nama;
        this.nidn = nidn;
        this.usia = usia;
        this.matkul = matkul;
    }

    public void tampil() {
        System.out.println("Nama   : " + nama);
        System.out.println("NIDN   : " + nidn);
        System.out.println("Usia   : " + usia);
        System.out.println("Matkul : " + matkul);
        System.out.println("------------------------");
    }
}
