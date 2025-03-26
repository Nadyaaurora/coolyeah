|  | Algoritma dan Struktur Data |
|--|--|
|NIM  | 244107020034  |
|Nama | Nadya Aurora Gebi Agista |
|Kelas | TI - 1H |
|Repository| [link!] (https://github.com/Nadyaaurora/coolyeah)

# JOBSHEET 6 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

## **PRAKTIKUM**
## 5.2 Praktikum 1 - Mengimplementasikan Sorting menggunakan object
### a. SORTING – BUBBLE SORT
#### 5.2.2 Verifikasi Hasil Percobaan
![Output](../img/Sorting%20-%20Bubble%20Sort.png)

### b. SORTING - SELECTION SORT
#### 5.2.3 Verifikasi Hasil Percobaan
![Output](../img/Sorting%20-%20Selection%20Sort.png)

### c. SORTING – INSERTION SORT
#### 5.2.4 Verifikasi Hasil Percobaan
![Output](../img/Sorting%20-%20Insertion%20Sort.png)

#### 5.2.5 Pertanyaan
1. Kode tersebut digunakan untuk membandingkan dua elemen yang berdekatan dalam array. Jika elemen di sebelah kiri lebih besar daripada elemen di sebelah kanan, maka keduanya akan ditukar (swap). Proses ini dilakukan secara berulang sehingga nilai yang lebih kecil secara bertahap akan berpindah ke posisi yang lebih awal dalam array. Dengan mekanisme ini, data akan diurutkan secara ascending , sesuai dengan prinsip dasar algoritma Bubble Sort.
2. Kode program yang merupakan algoritma pencarian nilai minimum pada selection sort
	```java
	int  min  =  i;
	for (int  j  =  i  +  1; j  <  jumData; j++) {
		if (data[j] <  data[min]) {
			min  =  j;
		}
	}
	```
3. Kode tersebut akan melakukan perulangan selama nilai `j` lebih besar atau sama dengan 0 dan nilai `data[j]` lebih besar dari `temp`.
Dalam algoritma **Insertion Sort**, data dibagi menjadi dua bagian:
	* Bagian yang sudah terurut (di sebelah kiri).
	* Bagian yang belum terurut (di sebelah kanan).

Prosesnya dilakukan dengan mengambil satu elemen dari bagian yang belum terurut, lalu membandingkannya dengan elemen-elemen di bagian yang sudah terurut untuk disisipkan ke posisi yang benar. Perulangan `while` ini menentukan kapan elemen-elemen dalam bagian yang sudah terurut harus digeser ke kanan untuk memberikan tempat bagi elemen yang akan disisipkan.

	-   `j` digunakan untuk menunjuk elemen-elemen yang akan dibandingkan. 
	-   `i` digunakan untuk mengambil nilai `temp`, yaitu elemen dari bagian yang belum terurut yang akan ditempatkan pada posisi yang benar. Dengan cara ini, elemen yang lebih besar akan terus digeser ke kanan hingga ditemukan posisi yang tepat untuk `temp`, sehingga data tetap terurut secara bertahap.

4. Tujuannya adalah untuk menggeser nilai pada indeks `j` ke indeks `j + 1` dalam array agar memberi ruang bagi elemen yang akan disisipkan di posisi yang benar dalam proses Insertion Sort.

## 5.3 Praktikum 2 (Sorting Menggunakan Array of Object)
### 5.3.1 Mengurutkan Data Mahasiswa Berdasarkan IPK (Bubble Sort)
#### 5.3.3 Verifikasi Hasil Percobaan
![Output](../img/IPK%20-%20Bubble%20Sort.png)

#### 5.3.4 Pertanyaan
1.  **a. Mengapa syarat dari perulangan i adalah i < listMhs.length-1 ?**

		Syarat dari perulangan i adalah i < listMhs.length - 1 karena dalam algoritma Bubble Sort, kita hanya perlu melakukan n-1 iterasi untuk mengurutkan n elemen. Hal ini karena setelah n-1 iterasi, elemen terbesar sudah berada di posisi yang benar.

	**b. Mengapa syarat dari perulangan j adalah j < listMhs.length-i ?**

		Syarat dari perulangan j adalah j < listMhs.length - i karena setelah setiap iterasi i, elemen terbesar dari iterasi tersebut sudah berada di posisi akhir yang benar. Sehingga, kita tidak perlu membandingkan kembali elemen tersebut dalam iterasi selanjutnya.

	**c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?**
    
		Perulangan i akan berlangsung sebanyak 49 kali (karena i < 50 - 1 → i < 49). Tahap Bubble Sort yang ditempuh juga sebanyak 49 tahap, karena dalam setiap tahap, elemen terbesar dari bagian yang belum terurut akan dipindahkan ke posisi yang benar.
2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!
	```java
	import java.util.Scanner;
	public class MahasiswaDemo10 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10();

	        System.out.print("Masukkan jumlah mahasiswa: ");
	        int jumlah = sc.nextInt();
	        sc.nextLine(); 

	        for (int i = 0; i < jumlah; i++) {
	            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));

	            System.out.print("NIM: ");
	            String nim = sc.nextLine();
	            System.out.print("Nama: ");
	            String nama = sc.nextLine();
	            System.out.print("Kelas: ");
	            String kelas = sc.nextLine();
	            System.out.print("IPK: ");
	            double ipk = sc.nextDouble();
	            sc.nextLine(); 

	            Mahasiswa10 mhs = new Mahasiswa10(nim, nama, kelas, ipk);
	            list.tambah(mhs);
	        }

	        System.out.println("Data mahasiswa sebelum sorting:");
	        list.tampil();

	        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC):");
	        list.bubbleSort();
	        list.tampil();
	    }
	}
	```


## 5.3.5 Mengurutkan Data Mahasiswa Berdasarkan IPK (Selection Sort)
#### 5.3.6 Verifikasi Hasil Percobaan
![Output](../img/IPK%20-%20Selection%20Sort.png)

#### 5.3.7 Pertanyaan
Proses tersebut bertujuan untuk mencari nilai IPK terkecil dari `listMhs` dalam bagian yang belum terurut. Setelah indeks dengan IPK terkecil ditemukan, nantinya elemen tersebut akan ditukar dengan elemen di posisi `i` dalam algoritma Selection Sort.

## 5.4 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort
#### 5.4.2 Verifikasi Hasil Percobaan
![Output](../img/IPK%20-%20Insertion%20Sort.png)

#### 5.4.3 Pertanyaan
Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.

        ```java
        for (int  i  =  1; i  <  listMhs.length; i++) {
            Mahasiswa19  tmp  =  listMhs[i];
            int  j  =  i;
            while (j  >  0  &&  listMhs[j  -  1].ipk  <  tmp.ipk) {
                listMhs[j] =  listMhs[j  -  1];
                j--;
            }
            listMhs[j] =  tmp;
        }
        ```
	
## 5.5 Latihan Praktikum
Solusi ini diimplementasikan dalam `Dosen.java`, `DataDosen.java`, dan `DosenDemo.java`, dan berikut adalah tangkapan layar hasil program :
![Output](../img/Tugas%20Jobsheet%206%20(1).png)
![Output](../img/Tugas%20Jobsheet%206%20(2).png)

Langkah-langkah utama dalam program ini:
1.  Menginput data dosen, termasuk kode, nama, jenis kelamin, dan usia.  
2.  Menyimpan data dosen dalam array dengan kapasitas maksimal 10.  
3.  Menggunakan Bubble Sort untuk mengurutkan dosen berdasarkan usia dari termuda ke tertua (Ascending).  
4.  Menggunakan Insertion Sort untuk mengurutkan dosen berdasarkan usia dari tertua ke termuda (Descending).
5.  Menampilkan data dosen setelah input atau sorting dilakukan.