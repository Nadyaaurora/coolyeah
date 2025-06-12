public class SingleLinkedList00 {
    NodeMahasiswa00 head;
    NodeMahasiswa00 tail;
    
    boolean isEmpty() {
        return (head == null);
    }
    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa00 tmp = head;
            System.out.print("Isi Linked List: \n");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }
    public void addFirst(Mahasiswa00 input) {
        NodeMahasiswa00 ndInput = new NodeMahasiswa00(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(Mahasiswa00 input) {
        NodeMahasiswa00 ndInput = new NodeMahasiswa00(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(String key, Mahasiswa00 input) {
        NodeMahasiswa00 ndInput = new NodeMahasiswa00(input, null);
        NodeMahasiswa00 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    public void insertAt(int index, Mahasiswa00 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa00 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa00(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
