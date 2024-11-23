import java.util.Scanner;

public class BioskopWithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama;
        int baris, kolom;

        while (true) {
            // Menampilkan menu
            System.out.println("=== Menu ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            
            // Validasi pilihan menu
            int pilihan;
            while (!sc.hasNextInt()) {
                System.out.println("Masukkan angka yang valid (1-3):");
                sc.next(); // Menghapus input yang tidak valid
            }
            pilihan = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer input

            switch (pilihan) {
                case 1: // Input data penonton
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        
                        if (nama.trim().isEmpty()) {
                            System.out.println("Nama tidak boleh kosong. Silakan coba lagi.");
                            continue; // Restart input jika nama kosong
                        }

                        System.out.print("Masukkan baris (1-4): ");
                        while (!sc.hasNextInt()) {
                            System.out.println("Masukkan angka yang valid untuk baris (1-4):");
                            sc.next(); // Menghapus input yang tidak valid
                        }
                        baris = sc.nextInt();

                        System.out.print("Masukkan kolom (1-2): ");
                        while (!sc.hasNextInt()) {
                            System.out.println("Masukkan angka yang valid untuk kolom (1-2):");
                            sc.next(); // Menghapus input yang tidak valid
                        }
                        kolom = sc.nextInt();
                        sc.nextLine(); // Membersihkan buffer input

                        // Validasi input
                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Baris atau kolom tidak valid. Silakan coba lagi.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi oleh penonton lain. Silakan pilih kursi lain.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil disimpan.");
                            break; // Keluar dari loop input
                        }
                    }
                    break;

                case 2: // Tampilkan daftar penonton
                    System.out.println("=== Daftar Penonton ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            // Ganti null dengan ***
                            String display = (penonton[i][j] != null) ? penonton[i][j] : "***";
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + display);
                        }
                    }
                    break;

                case 3: // Exit
                    System.out.println("Terima kasih! Program selesai.");
                    sc.close();
                    return; // Keluar dari program

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }
        }
    }
}