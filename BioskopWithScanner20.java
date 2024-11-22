import java.util.Scanner;

public class BioskopWithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        String nama;
        int baris, kolom;
        String next;

        while (true) {
            System.out.println("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.println("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.println("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.println("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
