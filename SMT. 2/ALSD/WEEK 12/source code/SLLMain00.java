public class SLLMain00 {
    public static void main(String[] args) {
        SingleLinkedList00 sll = new SingleLinkedList00();
        Mahasiswa00 mhs1 = new Mahasiswa00("24410", "Aldi", "1A", 3.5);
        Mahasiswa00 mhs2 = new Mahasiswa00("24432", "Budi", "1E", 3.7);
        Mahasiswa00 mhs3 = new Mahasiswa00("23412", "Caca", "2G", 3.9);
        Mahasiswa00 mhs4 = new Mahasiswa00("22409", "Alya", "3H", 3.8);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Alya", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

    }
}
