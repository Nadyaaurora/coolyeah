public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size;
    int max = 10;
    int sudahKRS = 0; 
    int kuotaMaks = 30;

    public AntrianKRS() {
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        sudahKRS = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void menambahAntrian(Mahasiswa m) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak bisa menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = m;
        size++;
        System.out.println(m.nama + " berhasil didaftarkan ke antrian.");
    }

    public Mahasiswa[] layaniMahasiswa() {
        if (size < 2) {
            System.out.println("Jumlah antrian kurang dari 2 mahasiswa, tidak bisa proses KRS.");
            return null;
        }

        Mahasiswa[] dilayani = new Mahasiswa[2];
        for (int i = 0; i < 2; i++) {
            dilayani[i] = data[front];
            front = (front + 1) % max;
        }
        size -= 2;
        sudahKRS += 2;
        return dilayani;
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Daftar mahasiswa dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        int index = front;
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
            index = (index + 1) % max;
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            int count = Math.min(2, size);
            System.out.println("2 Mahasiswa terdepan:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < count; i++) {
                int index = (front + i) % max;
                data[index].tampilkanData();
            }
        }
    }

    public void tampilkanTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir dalam antrian:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahSudahKRS() {
        return sudahKRS;
    }

    public int getJumlahBelumKRS() {
        return kuotaMaks - sudahKRS;
    }

    public boolean isMaxDilayaniDPA() {
        return sudahKRS >= kuotaMaks;
    }
}
