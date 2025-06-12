public class SLLMain19 {
    public static void main(String[] args) {
        SingleLinkedList19 sll = new SingleLinkedList19();
        Mahasiswa19 mhs1 = new Mahasiswa19("24410", "Aldi", "1A", 3.5);
        Mahasiswa19 mhs2 = new Mahasiswa19("24432", "Budi", "1E", 3.7);
        Mahasiswa19 mhs3 = new Mahasiswa19("23412", "Caca", "2G", 3.9);
        Mahasiswa19 mhs4 = new Mahasiswa19("22409", "Alya", "3H", 3.8);

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
