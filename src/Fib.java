import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Fib {
    public static void main(String[] args) {
        System.out.println(fibN(5));
        System.out.println(fib(5));

        Fib5 fib5 = new Fib5();

        fib5.stream().limit(41).forEachOrdered(System.out::println);

    }

    public static int fib(int n) {

        Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1, 1));

        if (!memo.containsKey(n)) {
            memo.put(n, fib(n - 1) + fib(n - 2));
        }
        return memo.get(n);
    }

    public static int fibN(int n) {
        int last = 0;
        int next = 1;
        int oldLast;
        for (int i = 0; i < n; i++) {
            oldLast = last;
            last = next;
            next = oldLast + next;
        }
        return last;
    }

    public static class Fib5 {
        private int last = 0, next = 1; // fib(0), fib(1)

        public IntStream stream() {
            return IntStream.generate(() -> {
                int oldLast = last;
                last = next;
                next = oldLast + next;
                return oldLast;
            });
        }
    }
}
