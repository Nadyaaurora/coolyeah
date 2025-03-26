public class SortingMain19 {
    public static void main(String[] args) {
        int b[] = {30, 20, 2, 8, 14};
        Sorting19 dataurut2 = new Sorting19(b, b.length);
        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data setelah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

    }
}