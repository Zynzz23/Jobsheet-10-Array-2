import java.util.Scanner;

public class SIAKAD20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Meminta input jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        
        // Meminta input jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        // Membuat array dua dimensi dengan ukuran dinamis
        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];

        // Menginput nilai untuk setiap siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));

            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        // Menampilkan nilai yang telah dimasukkan
        System.out.println("\nNilai yang telah dimasukkan:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }

        // Menutup scanner
        sc.close();
    }
}