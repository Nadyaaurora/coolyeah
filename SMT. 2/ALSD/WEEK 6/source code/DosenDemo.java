public class DosenDemo {
    public static void main(String[] args) {
        DataDosen list = new DataDosen();

        Dosen19 d1 = new Dosen19("D001", "Dr. Budi", true, 45);
        Dosen19 d2 = new Dosen19("D002", "Prof. Ani", false, 50);
        Dosen19 d3 = new Dosen19("D003", "Dr. Satrio", true, 39);
        Dosen19 d4 = new Dosen19("D004", "Dr. Rina", false, 42);
        Dosen19 d5 = new Dosen19("D005", "Prof. Agam", true, 55);
        Dosen19 d6 = new Dosen19("D006", "Dr. Andi", true, 47);
        Dosen19 d7 = new Dosen19("D007", "Prof. Arman", true, 52);
        Dosen19 d8 = new Dosen19("D008", "Dr. Ida", false, 37);
        Dosen19 d9 = new Dosen19("D009", "Dr. Neva", false, 35);
        Dosen19 d10 = new Dosen19("D010", "Prof. Agung", true, 40);

        list.tambah(d1);
        list.tambah(d2);
        list.tambah(d3);
        list.tambah(d4);
        list.tambah(d5);
        list.tambah(d6);
        list.tambah(d7);
        list.tambah(d8);
        list.tambah(d9);
        list.tambah(d10);

        System.out.println("Data dosen sebelum sorting:");
        list.tampil();

        System.out.println("Data dosen setelah sorting berdasarkan usia (Bubble Sort - ASC):");
        list.sortingASC();
        list.tampil();

        System.out.println("Data dosen setelah sorting berdasarkan usia (Selection Sort - DESC):");
        list.sortingDESC();
        list.tampil();

        System.out.println("Data dosen setelah sorting berdasarkan usia (Insertion Sort - DESC):");
        list.insertionSort();
        list.tampil();
    }
}
