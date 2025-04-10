public class DataDosen19 {
    Dosen19[] listDsn;
    int idx;

    DataDosen19(int jumlah) {
        listDsn = new Dosen19[jumlah];
    }

    void tambah(Dosen19 d) {
        if (idx < listDsn.length) {
            listDsn[idx] = d;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil() {
        for (Dosen19 d : listDsn) {
            d.tampil();
            System.out.println("-----------------------");
        }
    }

    void sequentialSearch(String cariNama) {
        int ditemukan = 0;
        for (int i = 0; i < idx; i++) {
            if (listDsn[i].nama.equalsIgnoreCase(cariNama)) {
                listDsn[i].tampil();
                ditemukan++;
            }
        }
        if (ditemukan == 0) {
            System.out.println("Dosen dengan nama " + cariNama + " tidak ditemukan.");
        } else if (ditemukan > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama tersebut.");
        }
    }

    int binarySearch(int usia, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (listDsn[mid].usia == usia) {
                return mid;
            } else if (listDsn[mid].usia > usia) {
                return binarySearch(usia, left, mid - 1);
            } else {
                return binarySearch(usia, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilDataDosenByIndex(int index) {
        if (index != -1) {
            listDsn[index].tampil();
        } else {
            System.out.println("Dosen dengan usia tersebut tidak ditemukan.");
        }
    }
}