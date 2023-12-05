import java.util.Scanner;

public class NilaiMahasiswa21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah minggu: ");
        int jumlahMinggu = sc.nextInt();

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();

        int[][] nilaiMahasiswa = new int[jumlahMinggu][jumlahSiswa];

        inputNilai(nilaiMahasiswa);

        tampilkanNilai(nilaiMahasiswa);
        System.out.println(" ");

        nilaiTertinggi(nilaiMahasiswa);

        sc.close();
    }

    static void inputNilai(int[][] nilai) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Minggu ke-" + (i + 1));

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(" Siswa " + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        sc.close();
    }

    static void tampilkanNilai(int[][] nilai) {
        System.out.printf("%10s", "");
        for (int i = 0; i < nilai[0].length; i++) {
            System.out.printf("%-10s", "Siswa " + (i + 1));
        }
        System.out.println();
        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("Minggu " + (i + 1) + "  ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.printf("%-10s", nilai[i][j]);
            }
            System.out.println();
        }
    }

    static void nilaiTertinggi(int[][] nilai) {
        System.out.println("Nilai tertinggi:");

        for (int i = 0; i < nilai.length; i++) {
            int max = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                if (max < nilai[i][j]) {
                    max = nilai[i][j];
                }
            }
            System.out.println("Minggu " + (i + 1) + ": " + max);
        }
    }
}