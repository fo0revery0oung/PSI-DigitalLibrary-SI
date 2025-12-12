# Project-Catalog-Digital-Library-Information-System
## Deskripsi Singkat Sistem
Aplikasi Manajemen Katalog Buku Digital adalah sistem berbasis web yang digunakan untuk mengelola koleksi buku secara lebih terstruktur.
Sistem ini memungkinkan admin untuk menambah, mengedit, dan menghapus data buku, sementara pengguna dapat mencari
buku berdasarkan judul atau kategori serta melihat detail informasi buku. Sistem dirancang untuk memenuhi minimal 3–5 fitur
fungsional utama sesuai kebutuhan implementasi.

## Teknologi yang Digunakan
- HTML5, CSS3, JavaScript  
- PHP Native  
- MySQL (XAMPP)  
- Git & GitHub  

## Cara Menjalankan Aplikasi
1. Install XAMPP.  
2. Pindahkan folder proyek ke:

```
C:\xampp\htdocs\
```
3. Jalankan Apache dan MySQL.  
4. Buat database dengan nama:

```
katalog_buku
```
5. Import file `database.sql` melalui phpMyAdmin.  
6. Sesuaikan koneksi database pada:

```
config/database.php
```
7. Jalankan aplikasi melalui browser:

```
[http://localhost/katalog-buku/](http://localhost/katalog-buku/)
````

## Bagian yang Dibantu oleh Generative AI
Penggunaan AI pada proyek ini mengikuti batasan tugas, yaitu hanya sebagai alat bantu, bukan pengganti pengerjaan kode.
Bantuan AI digunakan untuk:
### 1. Membantu Menulis Fungsi Tertentu  
Contoh kode yang diberikan AI:  
```php
$query = "SELECT * FROM buku WHERE judul LIKE '%$keyword%'";
````
Kode tersebut kemudian disesuaikan kembali agar aman dan sesuai kebutuhan proyek.
### 2. Memberi Contoh Struktur Proyek
AI memberikan saran struktur folder sederhana:
```
/config
/database
/public
/views
```
Namun penyesuaian struktur akhir ditentukan sendiri sesuai kebutuhan implementasi.
### 3. Refactoring dan Komentar Kode
AI membantu menjelaskan perbaikan seperti:
* Menambahkan validasi input sebelum query
* Memberi komentar pada fungsi CRUD agar mudah dipahami
* Menyarankan pemisahan file konfigurasi database
### Penegasan
Seluruh implementasi final, logika fitur, perbaikan keamanan dasar, dan penyesuaian kode dilakukan secara mandiri oleh mahasiswa.
Tidak ada bagian sistem yang dilakukan sebagai copy-paste penuh dari AI tanpa pemahaman.
