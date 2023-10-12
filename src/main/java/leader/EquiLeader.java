package leader;

import java.util.Arrays;

public class EquiLeader {

    public int solution(int[] A) {

        int[] B = Arrays.copyOf(A, A.length);
        int leader = getLeader(B);

        if (leader == -1000000001) {
            return 0;
        }

        int[] leaderCount = new int[A.length];

        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == leader) {
                count++;
            }
            leaderCount[i] = count;
        }

        int result = 0;
        for (int i = 0; i < leaderCount.length - 1; i++) {
            if ((leaderCount[i] > (i + 1) / 2) &&
                    (leaderCount[leaderCount.length - 1] - leaderCount[i] > (leaderCount.length - 1 - i) / 2)) {
                result++;
            }
        }

        return result;
    }

    private int getLeader(int[] A) {

        Arrays.sort(A);

        int candidate = A[A.length / 2];

        int count = 0;
        for (int value : A) {
            if (value == candidate) {
                count++;
            }
        }

        if (count > A.length / 2) {
            return candidate;
        }

        return -1000000001;
    }
}
