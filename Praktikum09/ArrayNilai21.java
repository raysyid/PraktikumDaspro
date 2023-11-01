import java.util.Scanner;

public class ArrayNilai21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jumlahLulus = 0, jumlahTidak = 0, max = 0, min = 100, jumlah = 0, nilaiAkhir[] = new int[10];
        double rata;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
            jumlah += nilaiAkhir[i];

            if (max < nilaiAkhir[i]) {
                max = nilaiAkhir[i];
            } else if (min > nilaiAkhir[i]) {
                min = nilaiAkhir[i];
            }
        }
        System.out.println("");

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i+1) + " lulus");
                jumlahLulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i+1) + " tidak lulus");
                jumlahTidak++;
            }
        }
        System.out.println("");

        rata = (double) jumlah / nilaiAkhir.length;
        System.out.println("Rata-rata nilai: " + rata);
        System.out.println("");

        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("");

        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jumlahTidak);
    }
}