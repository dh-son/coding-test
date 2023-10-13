package maximumSliceProblem;


public class MaxDoubleSliceSum {

    public int solution(int[] A) {

        int result = 0;

        int[] maxLeft = new int[A.length];
        int[] maxRight = new int[A.length];

        for (int i = 1; i < A.length; i++) {
            maxLeft[i] = Math.max(0, maxLeft[i - 1] + A[i]);
        }

        for (int i = A.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(0, maxRight[i + 1] + A[i]);
        }

        for (int i = 1; i < A.length -1; i++) {
            result = Math.max(result, maxLeft[i - 1] + maxRight[i + 1]);
        }

        return result;
    }
}
