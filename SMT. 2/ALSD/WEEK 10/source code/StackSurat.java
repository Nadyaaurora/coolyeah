public class StackSurat {
   Surat19[] stack;
   int top, size;

   public StackSurat(int size) {
       this.size = size;
       stack = new Surat19[size];
       top = -1;
   }
   
   public boolean isFull() {
       return top == size - 1;
   }

   public boolean isEmpty() {
       return top == -1;
   }

   public void push(Surat19 surat) {
       if (!isFull()) {
           stack[++top] = surat;
       } else {
           System.out.println("Stack penuh! Tidak bisa menambahkan surat.");
       }
   }

   public Surat19 pop() {
       if (!isEmpty()) {
           return stack[top--];
       } else {
           System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
           return null;
       }
   }

   public Surat19 peek() {
       if (!isEmpty()) {
           return stack[top];
       } else {
           System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan.");
           return null;
       }
   }

   public void cariSurat(String nama) {
       boolean ditemukan = false;
       for (int i = 0; i <= top; i++) {
           if (stack[i].namaMhs.equalsIgnoreCase(nama)) {
               ditemukan = true;
               System.out.println("Surat ditemukan :");
               System.out.println("ID : " + stack[i].idSurat + ", Nama : " + stack[i].namaMhs +
                                  ", Kelas : " + stack[i].kelas + ", Jenis : " + stack[i].jenisIzin +
                                  ", Durasi : " + stack[i].durasi);
               break;
           }
       }
       if (!ditemukan) {
           System.out.println("Tidak ada surat dari mahasiswa bernama " + nama);
       }
   }
}
