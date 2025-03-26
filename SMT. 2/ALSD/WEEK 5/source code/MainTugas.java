public class MainTugas {
    public static void main(String[] args) {
        Tugas[] mahasiswa = {
            new Tugas("Ahmad", 220101001, 2022, 78, 82),
            new Tugas("Budi", 220101002, 2022, 85, 88),
            new Tugas("Cindy", 220101003, 2021, 90, 87),
            new Tugas("Dian", 220101004, 2021, 76, 79),
            new Tugas("Eko", 220101005, 2023, 92, 95),
            new Tugas("Fajar", 220101006, 2022, 88, 85),
            new Tugas("Gina", 220101007, 2023, 80, 83),
            new Tugas("Hadi", 220101008, 2020, 82, 84)
        };

        int[] uts = new int[mahasiswa.length], uas = new int[mahasiswa.length];
        for (int i = 0; i < mahasiswa.length; i++) {
            uts[i] = mahasiswa[i].nilaiUTS;
            uas[i] = mahasiswa[i].nilaiUAS;
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Nilai UTS tertinggi dengan Divide & Conquer: " + Tugas.utsTertinggi(uts, 0, uts.length - 1));
        System.out.println("Nilai UTS terendah dengan Divide & Conquer : " + Tugas.utsTerendah(uts, 0, uts.length - 1));
        System.out.println("Rata-rata nilai UAS dengan Brute Force     : " + Tugas.rerataUAS(uas));
        System.out.println("---------------------------------------------------");
    }
}
