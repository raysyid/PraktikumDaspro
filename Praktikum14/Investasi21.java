import java.util.Scanner;

public class Investasi21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan uang awal: ");
        double uangAwal = sc.nextDouble();

        System.out.print("Masukkan jumlah tahun: ");
        int tahun = sc.nextInt();

        double untung = 11.7;

        double uangAkhir = uangAwal * Investasi(untung, tahun);

        System.out.println("Hasil investasi: " + (int) uangAkhir);
        System.out.println("Hasil investasi: " + (int) InvestasiIter(uangAwal, tahun, untung));
    }

    public static double Investasi(double untung, int tahun) {
        if (tahun == 0) {
            return 1;
        } else {
            return (1 + untung / 100) * Investasi(untung, tahun - 1);
        }
    }

    public static double InvestasiIter(double uangAwal, int tahun, double untung) {
        for (int i = 0; i < tahun; i++) {
            uangAwal = uangAwal * (1 + 11.7 / 100);
        }
        return uangAwal;
    }
}