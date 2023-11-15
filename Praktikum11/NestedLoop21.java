import java.util.Scanner;

public class NestedLoop21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] suhu;

        System.out.print("Masukkan jumlah kota: ");
        int kota = sc.nextInt();
        suhu = new double[kota][4];
        System.out.println();

        for (int i = 0; i < suhu.length; i++) {
            System.out.println("KOTA KE-" + (i + 1));

            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print(" Suhu ke-" + (j + 1) + ": ");
                suhu[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        
        for (int i = 0; i < suhu.length; i++) {
            System.out.println("KOTA KE-" + (i + 1) + ": ");

            double totalSuhu = 0;

            for (double temp : suhu[i]) {
                System.out.print(temp + " ");
                totalSuhu += temp;
            }

            double rataSuhu = totalSuhu / suhu[i].length;
            System.out.println("\nRata-rata suhu: " + rataSuhu);
            System.out.println();
        }
    }
}