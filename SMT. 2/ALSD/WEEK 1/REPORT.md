
|  | Algoritma dan Struktur Data |
|--|--|
|NIM  | 244107020034  |
|Nama | Nadya Aurora Gebi Agista |
|Kelas | TI - 1H |
|Repository| (https://github.com/Nadyaaurora/coolyeah)

# JOBSHEET 1 KONSEP DASAR PEMROGRAMAN

## 2.2.1 Praktikum Pemilihan
Solusi ini diimplementasikan dalam **Pemilihan.java**, dan berikut adalah tangkapan layar hasil program.

**Hasil output ketika nilai input tidak sesuai ketentuan**

![enter image description here](https://i.postimg.cc/CLrZ2mKF/Screenshot-2025-02-19-214128.png)

**Hasil output ketika nilai input sesuai**

![enter image description here](https://i.postimg.cc/Rhs0jZ4P/Screenshot-2025-02-19-214200.png)

#### **Penjelasan Singkat:**
Program ini memiliki 4 langkah utama dalam menentukan nilai akhir mahasiswa:
1. **Memasukkan nilai tugas, kuis, UTS, dan UAS**  
   - Pengguna diminta untuk memasukkan empat komponen nilai dengan rentang 0-100.
2. **Memvalidasi input nilai**  
   - Jika ada nilai yang tidak berada dalam rentang 0-100, program akan menampilkan pesan **"Nilai Tidak Valid"** dan tidak akan melanjutkan perhitungan.
3. **Menghitung dan mengonversi nilai akhir**  
   - Nilai akhir dihitung dengan rumus:  

     ```
     Nilai Akhir = (Tugas × 0.2) + (Kuis × 0.1) + (UTS × 0.3) + (UAS × 0.3)
     ```

   - Setelah itu, nilai akhir dikonversi menjadi nilai huruf berdasarkan skala yang ditentukan.
4. **Menentukan status kelulusan**  
   - Jika nilai huruf **A, B+, B, C+, atau C**, mahasiswa **lulus**.  
   - Jika nilai huruf **D atau E**, mahasiswa **tidak lulus**.  
   - Program akan menampilkan pesan **"SELAMAT ANDA LULUS!"** atau **"TIDAK LULUS!"** sesuai dengan hasil konversi.

## 2.3.1 Praktikum Perulangan
Solusi ini diimplementasikan dalam *Perulangan.java*, dan berikut adalah tangkapan layar hasil outputnya. 
![enter image description here](https://i.postimg.cc/43Bjv75F/Screenshot-2025-02-19-215021.png)
 
 **Penjelasan Singkat:** 
 Program ini memiliki **3 langkah utama** dalam menampilkan pola berdasarkan NIM: 
 1. **Memasukkan NIM** 
	 - Pengguna diminta untuk memasukkan NIM sebagai input. 
2. **Menentukan nilai n** 
	- Program mengambil **2 digit terakhir NIM** sebagai nilai **n**.       						
	-  Jika nilai **n** kurang dari **10**, maka akan ditambah **10**. 
	-  Program menampilkan nilai **n** yang telah dihitung. 
3. **Menampilkan pola berdasarkan n** 
	 Program melakukan perulangan dari **1 hingga n**: 
	- Jika **i == 6 atau i == 10**, maka angka tersebut dilewati (*continue*). 
	-  Jika **i adalah bilangan genap**, maka angka tersebut ditampilkan. 
	-  Jika **i adalah bilangan ganjil**, maka akan ditampilkan simbol **"*"**.

## 2.4.1 Praktikum Array
Solusi ini diimplementasikan dalam **Array.java**, dan di bawah ini adalah hasil tangkapan layar dari program. 
![enter image description here](https://i.postimg.cc/htxd7VSc/Screenshot-2025-02-19-220724.png)


![enter image description here](https://i.postimg.cc/KY2g74zL/Screenshot-2025-02-19-220734.png)

 **Penjelasan Singkat :**
  Program ini memiliki 4 langkah utama: 
  1. **Memasukkan Data Mata Kuliah** 
	- Pengguna diminta untuk memasukkan nama mata kuliah, jumlah SKS, dan nilai huruf untuk 8 mata kuliah. 
  2. **Melakukan Validasi dan Konversi Nilai** 
	  - Program mengecek nilai huruf yang dimasukkan dan mengonversinya menjadi bobot nilai sesuai dengan skala 4. 
  3. **Menghitung Total Bobot Nilai** 
	  - Nilai bobot dikalikan dengan jumlah SKS untuk mendapatkan total bobot SKS. 
  4. **Menentukan Indeks Prestasi (IP) Semester** 
	  - Program menjumlahkan bobot SKS dan membaginya dengan total SKS untuk mendapatkan IP semester.

## 2.5.1 Praktikum Fungsi
Solusi ini diimplementasikan dalam **Fungsi.java**, dan di bawah ini adalah hasil tangkapan layar dari program. 
![enter image description here](https://i.postimg.cc/XqCVDc1v/Screenshot-2025-02-19-221546.png)

**Penjelasan Singkat :** 
Terdapat 2 langkah utama dalam program ini: 
1. **Menghitung Pendapatan** 
	- Mengalikan jumlah stok bunga di setiap cabang dengan harga satuannya. 
	- Menampilkan total pendapatan jika semua bunga terjual. 
2. **Memperbarui Stok Cabang RoyalGarden 4** 
	- Mengurangi stok bunga di cabang ke-4 sesuai dengan jumlah bunga yang mati. 
	- Menampilkan stok terbaru setelah bunga mati.
