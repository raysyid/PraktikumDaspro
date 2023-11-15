import java.util.Scanner;

public class Angka123 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nilai n: ");
            int n = sc.nextInt();

            if (n <= 2) {
                System.out.println("Tidak lebih dari 2");
                System.out.println();
                continue;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
            break;
        }
    }
}