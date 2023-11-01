import java.util.Scanner;

public class LinearSearch21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int arrayint[], key, hasil = -1, elemen;

        System.out.print("Masukkan jumlah elemen array: ");
        elemen = sc.nextInt();
        arrayint = new int[elemen];
        System.out.println("");

        for (int i = 0; i < arrayint.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + ": ");
            arrayint[i] = sc.nextInt();
        }
        System.out.println("");

        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();
        System.out.println("");

        for (int i = 0; i < arrayint.length; i++) {
            if (arrayint[i] == key) {
                hasil = i;
                System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
            }
        }

        if (hasil == -1) {
            System.out.println("Key tidak ditemukan");
        }
    }
}