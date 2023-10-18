import java.util.Scanner;

public class WhileKelipatan21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0, total = 0, counter = 0, bilangan;
        double rata;

        System.out.print("Masukkan bilangan 1-9: ");
        bilangan = sc.nextInt();

        while (i < 50) {
            if (i % bilangan == 0) {
                total += i;
                counter++;
            }
            i++;
        }
        System.out.printf("Pada rentang 1-50 terdapat %d bilangan kelipatan %d dengan total %d", counter, bilangan, total);
        sc.close();
        System.out.println(" ");
        rata =(double) total / counter;
        System.out.println("Rata-rata: " + rata);
    }
}
