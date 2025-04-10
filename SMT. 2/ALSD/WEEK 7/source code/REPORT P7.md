|  | Algoritma dan Struktur Data |
|--|--|
|NIM  | 244107020034  |
|Nama | Nadya Aurora Gebi Agista |
|Kelas | TI - 1H |
|Repository| [link!] (https://github.com/Nadyaaurora/coolyeah)

# JOBSHEET 7 SEARCHING

## PRAKTIKUM
## 6.2. Searching / Pencarian Menggunakan Agoritma Sequential Search
### 6.2.2. Verifikasi Hasil Percobaan

![Output](../img/Sequential%20Search.png)

### 6.2.3. Pertanyaan
1. Metode tampilPosisi digunakan untuk menampilkan posisi atau indeks dari data mahasiswa yang ditemukan dalam array berdasarkan IPK yang dicari. Jadi, fungsinya hanya menunjukkan urutan data tersebut berada di mana. Sedangkan metode tampilDataSearch digunakan untuk menampilkan informasi lengkap dari mahasiswa yang memiliki IPK tersebut, seperti NIM, Nama, Kelas, dan IPK. Metode ini berguna untuk mengetahui isi data mahasiswa yang ditemukan. Jadi, perbedaannya adalah tampilPosisi fokus pada letak data, sedangkan tampilDataSearch fokus pada isi atau detail dari data tersebut.
2. Fungsi break pada kode tersebut adalah untuk menghentikan proses perulangan (loop) secara langsung setelah data yang dicari ditemukan Saat kondisi `if (listMhs[j].ipk == cari)` bernilai true, artinya IPK yang dicari sudah ditemukan. Maka posisi diisi dengan indeks data tersebut, lalu break digunakan untuk keluar dari loop supaya program tidak lanjut mencari ke data berikutnya.

## 6.3. Searching / Pencarian Menggunakan Binary Search
### 6.3.2. Verifikasi Hasil Percobaan

![Output](../img/Binary%20Search.png)

### 6.3.3 Pertanyaan
1. Proses divide (pembagian) dalam algoritma binary search terjadi saat program membagi data menjadi dua bagian untuk mempersempit ruang pencarian. Pada kode berikut :
    ``` java
    mid  = (left  +  right) /  2;
    ```
2. Proses conquer terjadi saat program melakukan pencarian pada bagian tertentu dari data yang sudah dibagi. Ini terlihat dari pemanggilan rekursif berikut:
    ``` java 
    else if (listMhs[mid].ipk > cari) {
        return findBinarySearch(cari, left, mid - 1);
    }  
    else {
        return findBinarySearch(cari, mid + 1, right);
    }
    ```

3. Program masih bisa berjalan, namun hasilnya tidak akan sesuai. Jika data IPK tidak dalam keadaan terurut, meskipun data yang dicari ada dalam array, program dapat menampilkan bahwa data tidak ditemukan. Hal ini disebabkan karena algoritma binary search mengandalkan data yang sudah terurut untuk membagi dan mempersempit ruang pencarian secara akurat. Tanpa pengurutan, proses pencarian menjadi tidak valid dan menghasilkan output yang salah.

4.  Jika data IPK diurutkan dari besar ke kecil (descending), maka hasil binary search tidak sesuai, karena algoritma awal dibuat untuk data urut naik (ascending). Agar sesuai, ubah logika perbandingan di method `findBinarySearch` seperti ini:
    ```java
    else if (listMhs[mid].ipk < cari) {
        return findBinarySearch(cari, left, mid - 1);
    } else {
        return findBinarySearch(cari, mid + 1, right);
    }
    ```
Sebelumnya pakai `>` karena data diurutkan dari yang terkecil ke terbesar (ascending), namun sekarang diganti jadi `<` karena data diurut dari yang terbesar ke terkecil (descending).

5. Bagian yang dimodifikasi adalah input jumlah mahasiswa. Awalnya ditulis langsung sebagai angka tetap, lalu diubah menjadi input dari keyboard menggunakan Scanner. Nilai input ini juga digunakan untuk menentukan ukuran array saat membuat objek MahasiswaBerprestasi19. Berikut hasil modifikasi kode program : 
    ```java
    System.out.print("Masukkan jumlah mahasiswa: ");
    int  jumMhs  =  sc.nextInt();
    sc.nextLine();
    MahasiswaBerprestasi19  list  =  new  MahasiswaBerprestasi19(jumMhs);
    ```

## 6.5. Latihan Praktikum

Solusi ini diimplementasikan dalam `Dosen19.java`, `DataDosen19.java`, dan `DosenDemo19.java`, dan berikut adalah contoh hasil output program:

![Output](../img/Latihan%20Praktikum.png)

Langkah-langkah utama dalam program ini:
1.  Menginput data dosen, seperti NIDN, nama, matkul, dan usia.
2.  Menyimpan data dosen dalam array sesuai jumlah input dari pengguna.    
3.  Menampilkan seluruh data dosen yang telah diinput
4.  Melakukan pencarian data berdasarkan nama dosen menggunakan algoritma Sequential Search.
5.  Melakukan pencarian data berdasarkan usia dosen menggunakan algoritma Binary Search.
6.  Jika ditemukan lebih dari satu data dosen dengan nama yang sama, maka program akan memberikan peringatan berupa kalimat khusus.