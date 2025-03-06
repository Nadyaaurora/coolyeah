
public class PaketPengirimanMain {
    public static void main(String[] args) {
        PaketPengiriman[] paket = new PaketPengiriman[4];
        paket[0] = new PaketPengiriman("RESI001", 5.0, 50000.0);
        paket[1] = new PaketPengiriman("RESI002", 12.0, 100000.0);
        paket[2] = new PaketPengiriman("RESI003", 8.5, 22000.0);
        paket[3] = new PaketPengiriman("RESI004", 15.0, 200000.0);

        double totalOngkosKirim = 0;
        int beratLebih = 0;
        double ongkosLebih = 0;

        for (int i = 0; i < paket.length; i++) {
            paket[i].printData();
            System.out.println();
            double ongkos = paket[i].totalOngkos();
            totalOngkosKirim += ongkos;

            if (paket[i].berat > 10) { 
                beratLebih++;
                ongkosLebih += ongkos;
            }
        }

        System.out.println("Total Ongkos Kirim: " + totalOngkosKirim);
        System.out.println("Persentase Paket Berat lebih dari 10 kg: " + ((double) beratLebih / paket.length * 100) + "%");

        if (beratLebih > 0) {
            double rataRataOngkos = ongkosLebih / beratLebih;
            System.out.println("Rata-rata ongkos pengiriman untuk paket dengan berat lebih dari 10 kg : " + rataRataOngkos + "\n");
        } else {
            System.out.println("Tidak ada paket dengan berat lebih dari 10 kg !!\n");
        }
    }
}
