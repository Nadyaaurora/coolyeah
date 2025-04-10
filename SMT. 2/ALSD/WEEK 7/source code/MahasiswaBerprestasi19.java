public class MahasiswaBerprestasi19 {
    Mahasiswa19[] listMhs;
    int idx;

    // Constructor
    MahasiswaBerprestasi19(int n) {
        listMhs = new Mahasiswa19[n];
    }

    void tambah(Mahasiswa19 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data mahasiswa sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa19 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-----------------------");
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                return j;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data ditemukan dengan IPK " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPK\t : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            }
            else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            }  
            else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}