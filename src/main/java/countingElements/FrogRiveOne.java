package countingElements;

import java.util.HashSet;

public class FrogRiveOne {

    public int solution(int X, int[] A) {

        HashSet<Integer> check = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) {
                check.add(A[i]);
            }

            if (check.size() >= X) {
                return i;
            }
        }

        return -1;
    }
}
