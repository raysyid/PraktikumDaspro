import java.util.Scanner;

public class Bank21 {
    public static void main(String[] args) {
        double tabunganAwal, tabunganAkhir, bunga, persentaseBunga;
        int lamaMenabung;

        Scanner sc = new Scanner(System.in);

        persentaseBunga = 0.0002;

        System.out.print("Masukkan jumlah tabungan awal: ");
        tabunganAwal = sc.nextDouble();
        System.out.print("Masukkan lama menabung (bulan): ");
        lamaMenabung = sc.nextInt();

        bunga = persentaseBunga * lamaMenabung * tabunganAwal;
        tabunganAkhir = tabunganAwal + bunga;

        System.out.println("Bunga: " + bunga);
        System.out.println("Tabungan akhir: " + tabunganAkhir);


    }
}
