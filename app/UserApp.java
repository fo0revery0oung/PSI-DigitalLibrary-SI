package app;

import model.Book;
import service.BookService;
import util.InputUtil;

import java.util.List;

public class UserApp {
    private final BookService bookService;

    public UserApp(BookService bookService) {
        this.bookService = bookService;
    }

    public void run() {
        System.out.println("=== Aplikasi Katalog Buku - User ===");
        System.out.println("Pilih tipe user:");
        System.out.println("1. Mahasiswa (Student)");
        System.out.println("2. Dosen (Lecturer)");
        int t = InputUtil.readInt("Pilihan: ");
        String profile = (t == 2) ? "Lecturer" : "Student";
        System.out.println("Selamat datang, " + profile);

        showHomeRecommendations(profile);

        while (true) {
            System.out.println("\n-- Menu User --");
            System.out.println("1. Cari buku");
            System.out.println("2. Filter by kategori (ketik nama kategori)");
            System.out.println("3. Lihat detail buku (by ID)");
            System.out.println("4. Lihat buku terbaru");
            System.out.println("0. Kembali");
            int choice = InputUtil.readInt("Pilih: ");
            switch (choice) {
                case 1 -> search();
                case 2 -> filterByCategory();
                case 3 -> viewDetail();
                case 4 -> latest();
                case 0 -> { return; }
                default -> System.out.println("Pilihan tidak dikenal.");
            }
        }
    }

    private void showHomeRecommendations(String profile) {
        System.out.println("\n--- Rekomendasi untuk " + profile + " ---");
        if (profile.equals("Lecturer")) {
            // lecturers: show latest 5
            List<Book> rec = bookService.getLatestBooks(5);
            if (rec.isEmpty()) System.out.println("Tidak ada rekomendasi saat ini.");
            else rec.forEach(b -> System.out.println(b.toString()));
        } else {
            // students: prefer category "Textbook" first, otherwise latest
            List<Book> text = bookService.filterByCategory("Textbook");
            if (!text.isEmpty()) text.forEach(b -> System.out.println(b.toString()));
            else {
                List<Book> rec = bookService.getLatestBooks(5);
                if (rec.isEmpty()) System.out.println("Tidak ada rekomendasi saat ini.");
                else rec.forEach(b -> System.out.println(b.toString()));
            }
        }
    }

    private void search() {
        String keyword = InputUtil.readLine("Masukkan kata kunci (judul/penulis/kategori/tahun): ");
        List<Book> results = bookService.searchBooks(keyword);
        if (results.isEmpty()) System.out.println("Tidak ditemukan.");
        else results.forEach(b -> System.out.println(b.toString()));
    }

    private void filterByCategory() {
        String cat = InputUtil.readLine("Masukkan nama kategori: ");
        List<Book> res = bookService.filterByCategory(cat);
        if (res.isEmpty()) System.out.println("Tidak ditemukan untuk kategori: " + cat);
        else res.forEach(b -> System.out.println(b.toString()));
    }

    private void viewDetail() {
        int id = InputUtil.readInt("Masukkan ID buku: ");
        Book b = bookService.getBookById(id);
        if (b == null) System.out.println("Buku tidak ditemukan.");
        else System.out.println(b.toDetailedString());
    }

    private void latest() {
        List<Book> list = bookService.getLatestBooks(10);
        if (list.isEmpty()) System.out.println("Belum ada buku terbaru.");
        else list.forEach(b -> System.out.println(b.toString()));
    }
}
