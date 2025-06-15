import java.util.Scanner;
public class DLLMain {
        public static void main(String[] args) {
        DoubleLinkedList01 list = new DoubleLinkedList01();
        Scanner scan = new Scanner (System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Insert after nim tertentu");
            System.out.println("8. Tambah di indeks tertentu");
            System.out.println("9. Hapus berdasarkan indeks");
            System.out.println("10. Hapus data setelah NIM tertentu");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data berdasarkan indeks");
            System.out.println("14. Tampilkan jumlah data mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 :
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                    break;
                case 2 :
                    mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                    break;
                case 3 :
                    list.removeFirst();
                    break;
                case 4 :
                    list.removeLast();
                    break;
                case 5 :
                    list.print();
                    break;
                case 6 :
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node01 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;
                case 7 :
                    System.out.print("Masukkan NIM yang ingin dicari : ");
                    String nimKey = scan.nextLine();
                    found = list.search(nimKey);
                    if ( found != null) {
                        System.out.println("Data ditemukan");
                        found.data.tampil();
                        mhs = inputMahasiswa(scan);
                        list.insertAfter(nimKey, mhs);
                    } else{
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;
                   case 8:
                    System.out.print("Masukkan indeks: ");
                    int addIndex = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Masukkan data mahasiswa:");
                    mhs = inputMahasiswa(scan);
                    list.add(addIndex, mhs);
                    break;
                case 9:
                    System.out.print("Masukkan indeks yang ingin dihapus: ");
                    int delIndex = scan.nextInt();
                    scan.nextLine();
                    list.remove(delIndex);
                    break;
                case 10:
                    System.out.print("Masukkan NIM sebagai acuan penghapusan: ");
                    String key = scan.nextLine();
                    list.removeAfter(key);
                    break;
                case 11:
                    Mahasiswa01 first = list.getFirst();
                    if (first != null) first.tampil();
                    else System.out.println("List kosong.");
                    break;
                case 12:
                    Mahasiswa01 last = list.getLast();
                    if (last != null) last.tampil();
                    else System.out.println("List kosong.");
                    break;
                case 13:
                    System.out.print("Masukkan indeks yang ingin ditampilkan: ");
                    int idx = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa01 m = list.getByIndex(idx);
                    if (m != null) m.tampil();
                    else System.out.println("Indeks tidak ditemukan.");
                    break;
                case 14:
                    System.out.println("Jumlah data mahasiswa: " + list.size());
                    break;
                case 0 :
                    System.out.println("Keluar dari program.");
                    break;
                default :
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);
        scan.close();
    }
    public static Mahasiswa01 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine(); 
        return new Mahasiswa01(nim, nama, kelas, ipk);
    }
}
