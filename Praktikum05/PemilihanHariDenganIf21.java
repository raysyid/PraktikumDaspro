import java.util.Scanner;

public class PemilihanHariDenganIf21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int angka;
        String dayType;

        System.out.print("Input day number: ");
        angka = sc.nextInt();

        if (angka >=1 && angka <=5 ) {
            dayType = "weekday";
        } 
        else if (angka >= 6 && angka <= 7) {
            dayType = "weekend";
        } 
        else {
            System.out.println(angka + " is an invalid number"); return;        
        }
        System.out.println(angka + " is a " + dayType);

    }
}
