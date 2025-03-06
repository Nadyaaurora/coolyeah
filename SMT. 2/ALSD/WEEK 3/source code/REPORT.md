|  | Algoritma dan Struktur Data |
|--|--|
|NIM  | 244107020034  |
|Nama | Nadya Aurora Gebi Agista |
|Kelas | TI - 1H |
|Repository| [link!] (https://github.com/Nadyaaurora/coolyeah)

# JOBSHEET 3 ARRAY OF OBJECTS

## PRAKTIKUM
### 3.2.2 Verifikasi Hasil Percobaan

![enter image description here](https://i.ibb.co.com/q3Gshwhm/Screenshot-2025-02-27-101713.png)

### 3.2.3 Pertanyaan
1. Class yang dibuat sebagai array of object tidak harus selalu memiliki atribut dan method sekaligus.
2. Kode program tersebut membuat array yang dapat menampung 3 objek dari class Mahasiswa19. 
3. Class Mahasiswa19 memiliki konstruktor yang didefinisikan secara eksplisit. Namun dalam Java, jika sebuah class tidak memiliki konstruktor, maka Java secara otomatis menyediakan konstruktor default tanpa parameter. 
4. Kode program tersebut membuat objek baru dari class Mahasiswa19 dan mengisi value terhadap atribut objeknya.
5. Karena dalam java tidak dapat membuat 2 class di dalam 1 file yang sama.

### 3.3 Menerima Input Isian Array Menggunakan Looping
### 3.3.2 Verifikasi Hasil Percobaan

![enter image description here](https://i.ibb.co.com/vxCnLwnP/Screenshot-2025-02-27-104819.png)

### 3.3.3 Pertanyaan
1.  Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3.
    ``` java
    void  cetakInfo() {
        System.out.println("NIM : "  +  nim);
        System.out.println("NAMA : "  +  nama);
        System.out.println("KELAS : "  +  kelas);
        System.out.println("IPK : "  +  ipk);
        System.out.println("----------------------");
    }
    ```
2. Error terjadi karena setiap elemen array belum diinisialisasi sebagai objek Mahasiswa.

## 3.4 Constructor Berparameter
### 3.4.2 Verifikasi Hasil Percobaan

![enter image description here](https://i.postimg.cc/hvpcwV9v/Screenshot-2025-03-06-204354.png)

### 3.4.3 Pertanyaan
1. Iya, berikut adalah contoh class yang memiliki lebih dari satu konstruktor :
	```java
	public  Dosen19() { 
	}

	public  Dosen19(String  kode, String  nama, boolean  jenisKelamin, int  usia) {
		this.kode  =  kode;
		this.nama  =  nama;
		this.jenisKelamin  =  jenisKelamin;
		this.usia  =  usia;
	}
	```
2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah

    ![enter image description here](https://i.postimg.cc/2ShGdYhc/Screenshot-2025-03-06-222653.png)


    ![enter image description here](https://i.postimg.cc/L6M3H7rj/Screenshot-2025-03-06-223026.png)


3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar

    ![enter image description here](https://i.postimg.cc/CLQMCTSq/Screenshot-2025-03-06-223505.png)

    ![enter image description here](https://i.postimg.cc/pdN27f9V/Screenshot-2025-03-06-223516.png)

4. Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari array of object Matakuliah ditentukan oleh user melalui input dengan Scanner

    ![enter image description here](https://i.postimg.cc/3Js5JK3n/Screenshot-2025-03-06-224024.png)

## TUGAS
1.  Solusi ini diimplementasikan dalam **Dosen19.java** dan **DosenMain19.java**, dan berikut adalah tangkapan layar hasil program:

    ![enter image description here](https://i.postimg.cc/6QWLxv4R/Screenshot-2025-03-06-213744.png)

Langkah-langkah utama dalam program ini :

- Menginput data dosen, termasuk kode, nama, jenis kelamin, dan usia.
- Menyimpan data dosen dalam array untuk diolah lebih lanjut.
- Menampilkan seluruh data dosen yang telah dimasukkan, termasuk informasi jenis kelamin yang dikonversi menjadi "Pria" atau "Wanita".

2. Solusi ini diimplementasikan dalam **Dosen19.java**, **DosenDemo19.java**, dan **DataDosen19.java**. Berikut hasil program:

    ![enter image description here](https://i.postimg.cc/T1sLFyMV/Screenshot-2025-03-06-220704.png)

    ![enter image description here](https://i.postimg.cc/4ypyLWPg/Screenshot-2025-03-06-220713.png)

Langkah-langkah utama dalam program ini :

- Menginput data dosen (kode, nama, jenis kelamin, usia) dan menyimpannya dalam array.
- Menampilkan seluruh data dosen yang telah dimasukkan.
- Menghitung jumlah dosen berdasarkan jenis kelamin (Pria/Wanita).
- Menghitung rata-rata usia dosen berdasarkan jenis kelamin, dengan hasil ditampilkan hingga dua angka di belakang koma.
- Menampilkan dosen paling tua dan paling muda berdasarkan usia.