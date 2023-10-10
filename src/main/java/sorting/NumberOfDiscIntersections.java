package sorting;

import java.util.Arrays;

public class NumberOfDiscIntersections {

    public int solution(int[] A) {

        long[] lower = new long[A.length];
        long[] upper = new long[A.length];

        for (int i = 0; i < A.length; i++) {
            lower[i] = (long) i - A[i];
            upper[i] = (long) i + A[i];
        }

        Arrays.sort(lower);
        Arrays.sort(upper);

        int count = 0;
        int indexUpper = 0;
        int result = 0;

        for (long value : lower) {

            while (value > upper[indexUpper]) {
                count--;
                indexUpper++;
            }

            result += count;
            count++;

            if (result > 10000000) {
                return  -1;
            }
        }

        return result;
    }
}
