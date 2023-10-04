import java.util.Scanner;

public class PemilihanHari21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String dayName, dayType;

        System.out.print("Input day name: ");
        dayName = sc.nextLine();

        switch (dayName) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default :
                System.out.println(dayName + " is an invalid day name");return;  
        }
        System.out.println(dayName + " is a " + dayType);

    }
}
