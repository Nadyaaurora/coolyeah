
### 3.2.2 Verifikasi Hasil Percobaan
![enter image description here](https://i.ibb.co.com/q3Gshwhm/Screenshot-2025-02-27-101713.png)

### 3.2.3 Pertanyaan
1. Class yang dibuat sebagai array of object tidak harus selalu memiliki atribut dan method sekaligus.
Sebuah class minimal harus memiliki atribut agar objek dapat menyimpan data. Namun, keberadaan method bersifat opsional, tergantung kebutuhan. Jika hanya digunakan sebagai wadah data, class cukup berisi atribut saja. Tetapi jika ingin ada perilaku atau fungsi tertentu, maka method diperlukan.
2. Kode program tersebut membuat array yang dapat menampung 3 objek dari class Mahasiswa19. 
3. Class Mahasiswa19 memiliki konstruktor yang didefinisikan secara eksplisit. Namun, dalam Java, jika sebuah class tidak memiliki konstruktor, maka Java secara otomatis menyediakan konstruktor default tanpa parameter. Karena itu, pemanggilan new Mahasiswa19() tetap bisa dilakukan, dan objek baru akan dibuat dengan nilai default untuk atributnya (null untuk string dan 0.0 untuk tipe numerik).
4. Kode program tersebut membuat objek baru dari class Mahasiswa19 dan menyimpannya di elemen pertama array arrayOfMahasiswa. Setelah objek dibuat, atribut nim, nama, kelas, dan ipk diisi dengan nilai yang diberikan.
5. Class Mahasiswa dan MahasiswaDemo dipisahkan agar class Mahasiswa berfungsi sebagai blueprint atau template untuk objek mahasiswa, sementara MahasiswaDemo digunakan untuk menguji dan menjalankan program dengan membuat serta memanipulasi objek dari class Mahasiswa. Pemisahan ini membuat kode lebih terstruktur, mudah dipahami, dan lebih fleksibel untuk digunakan kembali di program lain

### 3.3 Menerima Input Isian Array Menggunakan Looping
### 3.3.2 Verifikasi Hasil Percobaan
![enter image description here](https://i.ibb.co.com/vxCnLwnP/Screenshot-2025-02-27-104819.png)
### 3.3.3 Pertanyaan