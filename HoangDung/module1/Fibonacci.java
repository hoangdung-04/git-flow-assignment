public class Fibonacci {

    public static int Fibonacci(int n, boolean flag) {
        if (!flag) return 0;

        if (n <= 1) return n;
        return Fibonacci(n - 1, true) + Fibonacci(n - 2, true);
    }

}







