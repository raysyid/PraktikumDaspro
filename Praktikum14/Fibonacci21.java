public class Fibonacci21 {
    public static void main(String[] args) {
        int n = 12, hasil;
        System.out.println("Deret Fibonacci:");
        for (int i = 1; i <= n; i++) {
            hasil = fibonacci(i);
            System.out.print(hasil + ", ");
        }
        System.out.println("...");

        for (int i = 1; i <= n; i++) {
            hasil = fibonacciIter(i);
            System.out.print(hasil + ", ");
        }
        System.out.println("...");
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    public static int fibonacciIter(int n) {
        if (n <= 1) {
            return n;
        }
        int fibMin2 = 0, fibMin1 = 1, fibN = 0;

        for (int i = 2; i <= n; i++) {
            fibN = fibMin1 + fibMin2;
            fibMin2 = fibMin1;
            fibMin1 = fibN;
        }
        return fibN;
    }
}