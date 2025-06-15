public class Antrian19 {
    NodeMahasiswa19 front, rear;
    int size;

    public Antrian19() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false; 
    }

    public void enqueue(Mahasiswa19 data) {
        NodeMahasiswa19 baru = new NodeMahasiswa19(data, null);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
    }

    public Mahasiswa19 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa memanggil.");
            return null;
        }
        Mahasiswa19 data = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return data;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian terakhir: ");
            rear.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar antrian:");
            NodeMahasiswa19 current = front;
            while (current != null) {
                current.data.tampilInformasi();
                current = current.next;
            }
        }
    }
}
