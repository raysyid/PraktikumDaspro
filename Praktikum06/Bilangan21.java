import java.util.Scanner;

public class Bilangan21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bil1, bil2, bil3, max, middle, min;

        System.out.print("Masukkan bilangan 1: ");
        bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        bil2 = sc.nextInt();
        System.out.print("Masukkan bilangan 3: ");
        bil3 = sc.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                max = bil1;
                if (bil2 > bil3) {
                    middle = bil2;
                    min = bil3;
                } else {
                    middle = bil3;
                    min = bil2;
                }
            } else {
                max = bil3;
                if (bil1 > bil2) {
                    middle = bil1;
                    min = bil2;
                } else {
                    middle = bil2;
                    min = bil1;
                }
            }
        } else {
            if (bil2 > bil3) {
                max = bil2;
                if (bil1 > bil3) {
                    middle = bil1;
                    min = bil3;
                } else {
                    middle = bil3;
                    min = bil1;
                }
            } else {
                max = bil3;
                if (bil1 > bil2) {
                    middle = bil1;
                    min = bil2;
                } else {
                    middle = bil2;
                    min = bil1;
                }
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Middle: " + middle);
        System.out.println("Min: " + min);
    }
}
