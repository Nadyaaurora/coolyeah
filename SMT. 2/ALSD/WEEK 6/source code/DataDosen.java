public class DataDosen {
    Dosen19[] dataDosen = new Dosen19[10];
    int idx = 0;

    public void tambah(Dosen19 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil() {
        for (Dosen19 d : dataDosen) {
            d.tampil();
            System.out.println("----------------------------");
        }
    }

    void sortingASC() { 
        for (int i = 0; i < dataDosen.length - 1; i++) {
            for (int j = 1; j < dataDosen.length - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j - 1].usia) {
                    Dosen19 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
    }

    void sortingDESC() { 
        for (int i = 0; i < dataDosen.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia < dataDosen[idxMin].usia){
                    idxMin = j;
                }
            }
            Dosen19 tmp = dataDosen[idxMin];
            dataDosen[idxMin] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen19 tmp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia > tmp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = tmp;
        }
    }
}
