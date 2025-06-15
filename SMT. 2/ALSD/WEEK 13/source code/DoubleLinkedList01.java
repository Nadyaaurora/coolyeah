public class DoubleLinkedList01 {
   Node01 head;
   Node01 tail;

   public DoubleLinkedList01() {
      head = null;
      tail = null;
   }

   public boolean isEmpty() {
      return head == null;
   }

   public void addFirst(Mahasiswa01 data) {
      Node01 newNode = new Node01(data);
      if (isEmpty()) {
         head = tail = newNode;
      } else {
         newNode.next = head;
         head.prev = newNode;
         head = newNode;
      }
   }

   public void addLast(Mahasiswa01 data) {
      Node01 newNode = new Node01(data);
      if (isEmpty()) {
         head = tail = newNode;
      } else {
         tail.next = newNode;
         newNode.prev = tail;
         tail = newNode;
      }
   }

   public void insertAfter(String keyNim, Mahasiswa01 data) {
      Node01 current = head;
      // cari node dengan nim = key
      while (current != null && !current.data.nim.equals(keyNim)) {
         current = current.next;
      }
      if (current == null) {
         System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
         return;
      }
      Node01 newNode = new Node01(data);
      // jika current adalah tail, tambahkan di akhir
      if (current == tail) {
         current.next = newNode;
         newNode.prev = current;
         tail = newNode;
      } else {
         // sisipkan di tengah
         newNode.next = current.next;
         newNode.prev = current;
         current.next = newNode;
         newNode.next.prev = newNode;
      }
      System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
   }

   public void print() {
      Node01 current = head;
      while (current != null) {
         current.data.tampil();
         current = current.next;
      }
   }

   public void removeFirst() {
      if (isEmpty()) {
         System.out.println("List kosong, tidak bisa dihapus.");
         return;
      } else {
         System.out.println("Data yang terhapus adalah : ");
         head.data.tampil();
      }
      if (head == tail) {
         head = tail = null;
      } else {
         head = head.next;
         head.prev = null;
      }
      System.out.println("Data sudah berhasil dihapus.");
   }

   public void removeLast() {
      if (isEmpty()) {
         System.out.println("List kosong, tidak bisa dihapus.");
         return;
      }
      if (head == tail) {
         head = tail = null;
      } else {
         tail = tail.prev;
         tail.next = null;
      }
   }

   public Node01 search(String nim) {
      Node01 current = head;
      while (current != null) {
         if (current.data.nim.equals(nim)) {
            return current;
         }
         current = current.next;
      }
      return null;
   }

   public void add(int index, Mahasiswa01 data) {
      if (index == 0) {
         addFirst(data);
      } else if (index < 0) {
         System.out.println("Indeks tidak valid.");
      } else if (index > size()) {
         System.out.println("Indeks melebihi batas maksimal.");
      } else {
         Node01 temp = head;
         for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
         }
         Node01 newNode = new Node01(data);
         newNode.prev = temp;
         newNode.next = temp.next;

         if (temp.next != null) {
            temp.next.prev = newNode;
         } else {
            tail = newNode; 
         }
         temp.next = newNode;
      }
   }

   int size() {
      int size = 0;
      Node01 tmp = head;
      while (tmp != null) {
         size++;
         tmp = tmp.next;
      }
      return size;
   }

   public void removeAfter(String key) {
       Node01 temp = head;
      while (temp != null && !temp.data.nim.equalsIgnoreCase(key)) {
         temp = temp.next;
      }
      if (temp == null) {
         System.out.println("data " + key + " tidak ditemukan");
      } else if (temp == tail) {
         System.out.println("tidak ada data setelah " + key + " karena data tersebut adalah data terakhir");
      } else {
         if (temp.next == tail) {
            removeLast();
         } else {
            System.out.println("data berhasil dihapus. data yang terhapus adalah NIM: " + temp.next.data.nim);
            temp.next = temp.next.next;
            temp.next.prev = temp;
         }
      }
   }

   public void remove(int index) {
      if (isEmpty()) {
         System.out.println("List kosong, tidak bisa dihapus.");
      } else if (index == 0) {
         removeFirst();
      } else {
         Node01 temp = head;
         for (int i = 0; i < index; i++) {
            temp = temp.next;
         }
         if (temp == tail) {
            removeLast();
         } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
         }
      }
   }

   Mahasiswa01 getFirst() {
      if (!isEmpty()) {
         return head.data;
      } else {
         return null;
      }
   }

   Mahasiswa01 getLast() {
      if (!isEmpty()) {
         return tail.data;
      } else {
         return null;
      }
   }

   Mahasiswa01 getByIndex(int index) {
      if (!isEmpty()) {
         Node01 temp = head;
         for (int i = 0; i < index; i++) {
            temp = temp.next;
         }
         return temp.data;
      } else
         return null;
   }
}
