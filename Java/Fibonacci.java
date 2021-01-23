public class Fibonacci {

    static int[] memo = new int[1001];
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    static int fibonacci (int n) {
        System.out.println(n + "피보나치 구하는 중 ");
        if (n <= 1) {
            return n;
        } else {
            if (memo[n] > 0) {
                return memo[n];
            }
            final int first = fibonacci(n - 1);
            final int second = fibonacci(n - 2);
            System.out.println("first : " + first + "second : " + second);
            memo[n] = first + second;
            return memo[n];
        }
    }
}