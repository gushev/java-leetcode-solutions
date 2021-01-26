package other.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Long, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(fib(50));
        System.out.println(fibBottomUp(50));
    }

    private static long fib(long n) {
        if (memo.containsKey(n)) return memo.get(n);

        if (n > 2) {
            long fib = fib(n - 1) + fib(n - 2);
            memo.put(n, fib);
            return fib;
        }

        return 1;
    }

    private static long fibBottomUp(long n) {
        if (n == 1 || n == 2) return 1;

        long minusOne = 1;
        long minusTwo = 1;
        long result = 0;

        for(long i = 3; i <= n; i++) {
            result = minusOne + minusTwo;
            minusOne = minusTwo;
            minusTwo = result;
        }

        return result;
    }
}
