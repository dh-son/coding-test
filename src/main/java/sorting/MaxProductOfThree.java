package sorting;

import java.util.Arrays;

public class MaxProductOfThree {

    public int solution(int[] A) {

        Arrays.sort(A);

        int value1 = A[A.length-1] * A[A.length-2] * A[A.length-3];
        int value2 = A[0] * A[1] * A[A.length-1];

        return Math.max(value1, value2);
    }
}
