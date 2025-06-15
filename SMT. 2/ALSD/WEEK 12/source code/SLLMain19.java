import java.util.Scanner;

public class SLLMain19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList19 sll = new SingleLinkedList19();
        Mahasiswa19 mhs1 = new Mahasiswa19("24410", "Aldi", "1A", 3.5);
        Mahasiswa19 mhs2 = new Mahasiswa19("24432", "Budi", "1E", 3.7);
        Mahasiswa19 mhs3 = new Mahasiswa19("23412", "Caca", "2G", 3.9);
        Mahasiswa19 mhs4 = new Mahasiswa19("22409", "Alya", "3H", 3.8);
        Mahasiswa19 mhs5 = new Mahasiswa19("22212202", "Cintia", "3C", 3.5);
        Mahasiswa19 mhs6 = new Mahasiswa19("23212201", "Bimon", "2B", 3.8);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Alya", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        sll.addLast(mhs5);
        sll.addLast(mhs6);

        System.out.println("Masukkan data mahasiswa: ");
        System.out.print("NIM  : ");
        String nim = sc.nextLine();
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("IPK  : ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        Mahasiswa19 mhs = new Mahasiswa19(nim, nama, kelas, ipk);
        sll.addLast(mhs);
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}