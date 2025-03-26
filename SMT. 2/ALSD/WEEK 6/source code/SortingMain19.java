public class SortingMain19 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting19 dataurut1 = new Sorting19(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data setelah diurutkan dengan BUBBLE SORT (ASC) : ");
        dataurut1.tampil();
    }
}
