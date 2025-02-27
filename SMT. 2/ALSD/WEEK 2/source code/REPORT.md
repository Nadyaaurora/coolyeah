
|  | Algoritma dan Struktur Data |
|--|--|
|NIM  | 244107020034  |
|Nama | Nadya Aurora Gebi Agista |
|Kelas | TI - 1H |
|Repository| [link!] (https://github.com/Nadyaaurora/coolyeah)

# JOBSHEET 2 OBJECT

## PRAKTIKUM
## 2.1 Deklarasi Class, Atribut dan Method
### 2.1.2 Verifikasi Hasil Percobaan
![enter image description here](https://i.ibb.co.com/tPDZ5Vv9/Screenshot-2025-02-26-161938.png)

### 2.1.3 Pertanyaan
1. Class atau object memiliki dua karakteristik, yaitu atribut sebagai data yang dimiliki dan metode sebagai perilaku atau fungsi yang dapat dilakukan.
2. Class Mahasiswa19 memiliki 4 atribut, yaitu:
	- nama
	- nim
	- kelas
	- ipk
3. Class Mahasiswa19 memiliki 4 method, yaitu:
	- tampilkanInformasi()
	- ubahKelas(String kelasBaru)
	- updateIpk(double ipkBaru)
	- nilaiKinerja()
4. ```java
	void  updateIpk(double  ipkBaru) {
		if (ipkBaru  <  0.0  ||  ipkBaru  >  4.0) {
		System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
		return;
	}
		ipk  =  ipkBaru;
	}
	```
5. Method `nilaiKinerja()` bekerja dengan mengevaluasi IPK mahasiswa melalui serangkaian kondisi. Jika IPK memenuhi suatu rentang nilai tertentu, method akan mengembalikan string yang menggambarkan kinerja mahasiswa sesuai dengan kategorinya.

## 2.2 Instansiasi Object, serta Mengakses Atribut dan Method
### 2.2.2 Verifikasi Hasil Percobaan
![enter image description here](https://i.ibb.co.com/jvThr9xw/Screenshot-2025-02-26-172436.png)
### 2.2.3 Pertanyaan
1. Baris kode yang menunjukkan instansiasi :
    ```java
    Mahasiswa19  mhs1  =  new  Mahasiswa19();
    ```
    Nama objek yang dihasilkan adalah `mhs1`

2.  - Untuk mengakses atribut dari suatu objek, gunakan dot notation (.) dengan sintaks: namaObjek.namaAtribut
- Untuk mengakses method dari suatu objek, gunakan dot notation (.) diikuti dengan tanda kurung () untuk memanggilnya: namaObjek.namaMethod()
3. Hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda karena ada perubahan pada atribut objek mhs1.
Setelah pemanggilan pertama, method ubahKelas("SI 2K") mengubah nilai atribut kelas, dan updateIpk(3.60) mengubah nilai atribut ipk. Sehingga, saat tampilkanInformasi() dipanggil kedua kali, atribut yang ditampilkan sudah diperbarui.

## 2.3 Membuat Konstruktor
### 2.3.2 Verifikasi Hasil Percobaan
![enter image description here](https://i.ibb.co.com/9k1PNZ9h/Screenshot-2025-02-26-190927.png)

### 2.3.3 Pertanyaan
1. ```java
public  Mahasiswa19(String  nama, String  nim, double  ipk, String  kelas) {
this.nama  =  nama;
this.nim  =  nim;
this.ipk  =  ipk;
this.kelas  =  kelas;
}
```

2. Baris program tersebut membuat objek mhs2 dari class Mahasiswa19 dengan memanggil konstruktor berparameter. Saat objek dibuat, atribut nama, nim, ip, dan kelas langsung diinisialisasi dengan nilai yang diberikan. Setelah itu, objek mhs2 bisa digunakan dalam program.
3. Jika konstruktor default dihapus, program akan error saat membuat objek tanpa parameter. Hal ini terjadi karena ketika ada konstruktor berparameter, sistem tidak lagi menyediakan konstruktor default secara otomatis, sehingga setiap objek harus dibuat dengan memberikan parameter yang sesuai.
4. Tidak, method dalam class Mahasiswa tidak harus diakses secara berurutan. Method dapat dipanggil sesuai kebutuhan, karena setiap method bekerja secara independen dan tidak bergantung pada urutan pemanggilan, kecuali jika ada hubungan logis di antara mereka, seperti mengubah data sebelum menampilkannya.

5.  ```java
Mahasiswa19  mhsNadya  =  new  Mahasiswa19("Nadya Aurora Gebi Agista", "244107020034", 3.81, "TI 1H");
```

## LATIHAN PRAKTIKUM
1. Solusi ini diimplementasikan dalam **MataKuliah19.java** dan **MataKuliahMain19.java** dan berikut adalah tangkapan layar hasil program :
![enter image description here](https://i.postimg.cc/Hx7WJdx6/Screenshot-2025-02-27-225026.png)

    Langkah-langkah utama dalam program ini:
    -  Membuat dua objek mata kuliah (`mk1` dan `mk2`).
    -  Menampilkan informasi awal setiap mata kuliah.
    -  Mengubah jumlah SKS pada `mk1`.
    -  Menambahkan jam dan mengurangi jam untuk `mk1`.
    -  Jika jumlah jam yang dikurangi melebihi jam yang tersedia, akan muncul pesan error.
    -  Menampilkan informasi akhir setelah perubahan dilakukan.

2. Solusi ini diimplementasikan dalam **	Dosen19.java** dan **DosenMain19.java** dan berikut adalah tangkapan layar hasil program :
![enter image description here](https://i.postimg.cc/KcfvsZVg/Screenshot-2025-02-27-231850.png)

    Langkah-langkah utama dalam program ini:
    - Membuat dua objek dosen `d1` dan `d2` dengan menggunakan konstruktor default dan konstruktor dengan parameter.  
    -   Menampilkan informasi awal setiap dosen.    
    -   Mengubah status aktif dosen `d1` menjadi tidak aktif.
    -   Mengubah bidang keahlian dosen `d1` dari "Dasar Pemrograman" menjadi "Sistem Informasi".
    - Mengubah bidang keahlian dosen `d2` dari "Jaringan Komputer" menjadi "Bahasa Inggris".
    -   Menghitung masa kerja dosen berdasarkan tahun tertentu. 
    -   Menampilkan kembali informasi dosen setelah perubahan dilakukan.

