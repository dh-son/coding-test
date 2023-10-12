package leader;

import java.util.Arrays;

public class Dominator {

    public int solution(int[] A) {

        if (A.length == 0) { return -1; }


        int[] B = Arrays.copyOf(A, A.length);

        Arrays.sort(A);

        int candidate = A[A.length / 2];

        int count = 0;
        for (int value : A) {
            if (value == candidate) {
                count++;
            }
        }

        if (count <= A.length / 2) {
            return -1;
        }

        for (int i = 0; i < B.length; i++) {
            if (candidate == B[i]) {
                return i;
            }
        }
        return -1;
    }
}
