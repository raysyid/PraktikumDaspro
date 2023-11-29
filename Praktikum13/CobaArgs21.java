public class CobaArgs21 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hai " + args[0]);
            System.out.println("Selamat datang di " + args[1]);
        } else if (args.length == 0) {
            System.out.println("Hai, selamat datang");
        }
    }
}