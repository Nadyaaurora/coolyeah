public class Mahasiswa19 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa19() {

    }

    public Mahasiswa19(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.print(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
        System.out.println();
    }
}