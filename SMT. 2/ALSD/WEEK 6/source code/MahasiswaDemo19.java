public class MahasiswaDemo19 {
    public static void main(String[] args) {
        MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19();
        // Mahasiswa19 m1 = new Mahasiswa19("123", "Zidan", "2A", 3.2);
        // Mahasiswa19 m2 = new Mahasiswa19("124", "Ayu", "2A", 3.5);
        // Mahasiswa19 m3 = new Mahasiswa19("125", "Sofi", "2A", 3.1);
        // Mahasiswa19 m4 = new Mahasiswa19("126", "Sita", "2A", 3.9);
        // Mahasiswa19 m5 = new Mahasiswa19("127", "Miki", "2A", 3.7);

        // Mahasiswa19 m1 = new Mahasiswa19("123", "Ali", "2B", 3.9);
        // Mahasiswa19 m2 = new Mahasiswa19("124", "Ila", "2B", 3.1);
        // Mahasiswa19 m3 = new Mahasiswa19("125", "Agus", "2B", 3.6);
        // Mahasiswa19 m4 = new Mahasiswa19("126", "Tika", "2B", 3.3);
        // Mahasiswa19 m5 = new Mahasiswa19("127", "Udin", "2B", 3.2);

        
        Mahasiswa19 m1 = new Mahasiswa19("111", "Ayu", "2C", 3.7);
        Mahasiswa19 m2 = new Mahasiswa19("222", "Dika", "2C", 3.0);
        Mahasiswa19 m3 = new Mahasiswa19("333", "Ila", "2C", 3.8);
        Mahasiswa19 m4 = new Mahasiswa19("444", "Susi", "2C", 3.1);
        Mahasiswa19 m5 = new Mahasiswa19("555", "Yayuk", "2C", 3.4);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        
        System.out.println("Data mahasiswa sebelum sorting : ");
        list.tampil();

        // System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data mahasiswa setelah sorting berdasarkan SELECTION SORT (DESC) : ");
        // list.selectionSort();
        // list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan INSERTON SORT (DESC) : ");
        list.insertionSort();
        list.tampil();
    }
}
