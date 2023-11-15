import java.util.Scanner;

public class Persegi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nilai n: ");
            int n = sc.nextInt();

            if (n < 2) {
                System.out.println("Tidak lebih dari 2");
                System.out.println();
                continue;
            } else if (n % 2 == 0) {
                System.out.println("bukan angka ganjil");
                System.out.println();
                continue;
            }
            System.out.println();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n || i == 1 || i == n) {
                        System.out.print(n + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            System.out.println();
            }
            break;
        }
    }
}