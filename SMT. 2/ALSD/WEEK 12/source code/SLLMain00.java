public class SLLMain00 {
    public static void main(String[] args) {
        SingleLinkedList00 sll = new SingleLinkedList00();
        Mahasiswa00 mhs1 = new Mahasiswa00("123", "Aldi", "TI", 3.5);
        Mahasiswa00 mhs2 = new Mahasiswa00("456", "Budi", "TI", 3.5);

        sll.print();
        sll.addFirst();
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

    }
}
