package maximumSliceProblem;

public class MaxSliceSum {

    public int solution(int[] A) {

        int maxSliceSum = 0;
        int endValue = 0;

        for (int i = 0; i < A.length; i++) {
            if (i == 0) {
                endValue = A[i];
                maxSliceSum = A[i];
            } else {
                endValue = Math.max(A[i], endValue + A[i]);
                maxSliceSum = Math.max(maxSliceSum, endValue);
            }
        }

        return maxSliceSum;
    }
}
