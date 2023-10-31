package fibonacciNumbers;

public class Ladder {

    public int[] solution(int[] A, int[] B) {

        int[] fib = new int[50001];
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 2;

        for (int i = 3; i < fib.length; i++) {
            fib[i] = (fib[i - 1] + fib[i -2]) % (int) Math.pow(2, 30);
        }

        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = fib[A[i]] % (int) Math.pow(2, B[i]);
        }

        return result;
    }
}
