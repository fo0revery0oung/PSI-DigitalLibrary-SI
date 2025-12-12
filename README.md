Siap — berikut **README.md revisi** tanpa mencantumkan credential default.
(Username & password tetap ada di kode Java, tapi **tidak ditulis di README**.)

---

# 📚 Digital Library Catalog – Java CLI Application

Aplikasi **Katalog Buku Digital** ini dikembangkan menggunakan **Java (Console-Based / CLI)** untuk mendukung proses pencarian dan pengelolaan koleksi buku pada Program Studi Sistem Informasi. Sistem menyediakan fitur untuk tiga jenis peran: **Admin**, **User (Student/Lecturer)**, dan **Kaprodi**, dengan antarmuka berbasis teks yang sederhana dan mudah digunakan.

Aplikasi dirancang menggunakan pendekatan **Object-Oriented Programming (OOP)** serta arsitektur **3-layer** sederhana:
**Presentation Layer** → **Service Layer** → **Model Layer**.

---

## 📖 1. Deskripsi Singkat Sistem

Aplikasi ini menyediakan layanan katalog buku digital dengan fitur yang berbeda untuk tiap role:

### **Admin**

* Login menggunakan credential privat yang tersimpan di kode Java
* Kelola data buku (Tambah, Edit, Hapus)
* Melihat daftar seluruh buku

### **User — Student / Lecturer**

* Tidak perlu login
* Melihat daftar buku
* Mencari buku berdasarkan judul / penulis / kategori
* Melihat detail buku
* Filter buku berdasarkan kategori

### **Kaprodi**

* Login menggunakan credential privat internal
* Melihat seluruh katalog
* Melakukan pencarian
* Mengakses laporan data

---

## 🛠️ 2. Teknologi yang Digunakan

| Teknologi                | Fungsi                                                  |
| ------------------------ | ------------------------------------------------------- |
| **Java 17+**             | Bahasa utama aplikasi                                   |
| **OOP Principles**       | Class, object, encapsulation, inheritance, polimorfisme |
| **ArrayList**            | Penyimpanan data in-memory                              |
| **Scanner**              | Input dari CLI                                          |
| **Exception Handling**   | Validasi input dan penanganan error                     |
| **3-Layer Architecture** | Pemisahan tanggung jawab kode                           |

---

## 📂 3. Struktur Folder Project

```
src/
 ├── app/
 │   ├── MainApp.java
 │   ├── AdminApp.java
 │   ├── UserApp.java
 │   └── KaprodiApp.java
 ├── model/
 │   ├── Book.java
 │   ├── Author.java
 │   ├── Category.java
 │   └── Admin.java
 ├── service/
 │   ├── AuthService.java
 │   ├── AdminService.java
 │   ├── BookService.java
 │   └── ReportService.java
 └── util/
     └── InputUtil.java
```

---

## ▶️ 4. Cara Menjalankan Aplikasi

### **1. Compile**

Masuk ke direktori `src/`:

```
javac app/MainApp.java
```

Java akan otomatis meng-compile seluruh class di package lain.

---

### **2. Jalankan Aplikasi**

```
java app.MainApp
```

---

### **3. Login Admin & Kaprodi**

Credential login **disimpan secara private di dalam kode Java**,
dan **tidak ditampilkan di README** sesuai standar keamanan dokumentasi.

---

## 🤖 5. Bagian yang Dibantu oleh Generative AI

Generative AI digunakan hanya sebagai alat bantu dalam:

### **A. Penyusunan Struktur Kode**

AI memberikan rekomendasi struktur package seperti `app/`, `service/`, `model/`, dan `util/`.

### **B. Contoh Implementasi Awal**

AI memberi contoh snippet untuk:

* class model dasar seperti `Book`
* kerangka CRUD `BookService`
* format tampilan CLI

Mahasiswa kemudian menyesuaikan dan mengembangkan lebih lanjut.

### **C. Penyelesaian Error**

AI membantu memperbaiki:

* error Scanner newline
* NullPointerException saat list kosong
* infinite loop pada switch-case
* perbaikan formatting output CLI

### **D. Penjelasan Teknis**

Menjadi referensi saat memutuskan pemisahan class dan responsibility pada tiap layer.

📌 *Meskipun terbantu AI, keseluruhan desain, penyesuaian fungsi, integrasi role, dan flow aplikasi diselesaikan secara manual oleh mahasiswa.*

---

## 📜 6. Lisensi

Proyek ini dibuat untuk keperluan akademik dan pembelajaran.
Penggunaan ulang dan modifikasi diperbolehkan selama tetap mencantumkan atribusi kepada pengembang asli.

---

Jika kamu ingin:
✨ Dibuatkan versi PDF README
✨ Dibuatkan README versi Bahasa Inggris
✨ Ditambah screenshot CLI tampilan contoh
✨ Ditambah diagram arsitektur untuk README

Tinggal bilang aja!
