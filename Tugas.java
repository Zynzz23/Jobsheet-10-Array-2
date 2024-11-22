import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[][] = new int[10][10];
        int i = 0, j, jnk = 0, jnp[] = new int[6], jnr[] = new int[10];
        double rata2P[] = new double[6], rata2R[] = new double[10], rata2K;

        // Input nilai
        while (i < 10) {
            j = 0;
            while (j < 10) {
                System.out.print("Masukkan nilai n[" + i + "][" + j + "]: ");
                n[i][j] = sc.nextInt();
                jnk += n[i][j];
                j++;
            }
            i++;
        }

        // Hitung rata-rata keseluruhan
        rata2K = (double) jnk / 100;

        // Hitung rata-rata responden
        i = 0;
        while (i < 10) {
            jnr[i] = 0;
            for (j = 0; j < 6; j++) {
                jnr[i] += n[i][j];
            }
            rata2R[i] = (double) jnr[i] / 6;
            System.out.println("Nilai rata-rata responden " + (i + 1) + ": " + rata2R[i]);
            i++;
        }

        // Hitung rata-rata pertanyaan
        i = 0;
        while (i < 6) {
            jnp[i] = 0;
            for (j = 0; j < 10; j++) {
                jnp[i] += n[j][i];
            }
            rata2P[i] = (double) jnp[i] / 10;
            System.out.println("Nilai rata-rata pertanyaan " + (i + 1) + ": " + rata2P[i]);
            i++;
        }
    }
}

        // Tampilkan rata-rata keseluruhan