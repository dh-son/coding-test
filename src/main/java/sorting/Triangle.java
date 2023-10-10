package sorting;

import java.util.Arrays;

public class Triangle {

    public int solution(int[] A) {

        Arrays.sort(A);

        for (int i = A.length - 1; i > 1; i--) {
            long R = A[i], Q = A[i-1], P = A[i-2];
            if (R < Q + P) {
                return 1;
            }
        }

        return 0;
    }
}
