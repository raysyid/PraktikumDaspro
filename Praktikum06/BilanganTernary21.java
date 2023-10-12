import java.util.Scanner;

public class BilanganTernary21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bil1, bil2, bil3, bilTerbesar;

        System.out.print("Masukkan bilangan 1: ");
        bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        bil2 = sc.nextInt();
        System.out.print("Masukkan bilangan 3: ");
        bil3 = sc.nextInt();

        if (bil1 > bil2) {
            // if (bil1 > bil3) {
            //     bilTerbesar = bil1;
            // } else {
            //     bilTerbesar = bil3;
            // }

            bilTerbesar = (bil1 > bil3) ? bil1 : bil3;

        } else {
            // if (bil2 > bil3) {
            //     bilTerbesar = bil2;
            // } else {
            //     bilTerbesar = bil3;
            // }

            bilTerbesar = (bil2 > bil3) ? bil2 : bil3;
        }

        bilTerbesar = (bil1 > bil2) ? ((bil1 > bil3) ? bil1 : bil3) : ((bil2 > bil3) ? bil2 : bil3);

        System.out.println("Bilangan Terbesar: " + bilTerbesar);

    }
}
