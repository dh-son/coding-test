package fibonacciNumbers;

import primeAndCompositeNumbers.Peaks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibFrog {

    public int solution(int[] A) {
        int result = -1;

        int[] B = Arrays.copyOf(A, A.length + 1);
        B[A.length] = 1;

        List<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        for (int i = 2; i < 27; i++) {
            int value = fib.get(i -1) + fib.get(i - 2);
            if (value > B.length) {
                break;
            }
            fib.add(value);
        }

        int[] reachable = new int[B.length];
        Arrays.fill(reachable, -1);

        for (int value : fib) {
            if (B[value - 1] == 1) {
                reachable[value - 1] = 1;
            }
        }

        return result;
    }
}
