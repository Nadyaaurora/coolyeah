public class PaketPengiriman {
    String nomorResi;
    double berat;
    double ongkosDasar;

    public PaketPengiriman(String nomorResi, double berat, double ongkosDasar) {
        this.nomorResi = nomorResi;
        this.berat = berat;
        this.ongkosDasar = ongkosDasar;
    }

    double totalOngkos() {
        double total = ongkosDasar * berat;
        if (total > 100000) {
            total *= 0.10; 
        }
        return total;
    }

    void printData(){
        System.out.println("===== DATA BARANG =====");
        System.out.println("Nomor Resi : " + nomorResi);
        System.out.println("Berat Barang : " + berat);
        System.out.println("Ongkos : " + ongkosDasar);
        System.out.println("Total Ongkos : " + totalOngkos() );
        System.out.println("=======================");
    }
}
