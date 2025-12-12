package app;

import service.AdminService;
import service.BookService;
import service.ReportService;
import util.InputUtil;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Katalog Buku Digital - Perpustakaan Prodi Sistem Informasi (FULL JAVA) ===");

        // single shared services
        AdminService adminService = new AdminService(); // seeds admin & kaprodi
        BookService bookService = new BookService();   // seeds sample books
        ReportService reportService = new ReportService(bookService);

        while (true) {
            System.out.println("\n-- Menu Utama --");
            System.out.println("1. Admin");
            System.out.println("2. User (Mahasiswa/Dosen)");
            System.out.println("3. Kepala Program Studi (Kaprodi)");
            System.out.println("0. Keluar");
            int choice = InputUtil.readInt("Pilih: ");
            switch (choice) {
                case 1 -> new AdminApp(adminService, bookService, reportService).run();
                case 2 -> new UserApp(bookService).run();
                case 3 -> new KaprodiApp(adminService, bookService, reportService).run();
                case 0 -> { System.out.println("Terima kasih. Keluar aplikasi."); return; }
                default -> System.out.println("Pilihan tidak dikenal.");
            }
        }
    }
}
