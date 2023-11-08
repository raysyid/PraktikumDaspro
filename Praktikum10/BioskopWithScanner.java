import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Pilih menu: ");
            System.out.println("1.Input data penonton");
            System.out.println("2.Tampilkan daftar penonton");
            System.out.println("3.Exit");
            menu = sc.nextInt();
            
            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.next();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Maaf, kursi sudah terisi oleh " + penonton[baris-1][kolom-1] + ".");
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                    }

                    penonton[baris-1][kolom-1] = nama;

                    System.out.print("input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                System.out.println("Daftar penonton: ");

                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
                }
            } else if (menu == 3) {
                System.out.println("Program selesai");
                break;
                
            } else {
                System.out.println("Menu tidak valid. Silakan pilih lagi.");
            }

            System.out.print("Lanjut ke menu lain? (y/n): ");
            next = sc.next();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println();
        }  
    }
}