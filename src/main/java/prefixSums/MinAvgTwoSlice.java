package prefixSums;

public class MinAvgTwoSlice {

    public int solution(int[] A) {

        int[] prefixSum = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (i == 0) {
                prefixSum[i] = A[i];
            } else {
                prefixSum[i] = prefixSum[i-1] + A[i];
            }
        }

        double avgValue = 0;
        double minValue = 0;
        int index = 0;

        for (int i = 0; i < A.length; i++) {
            if (i == 1) {
                minValue = (double) prefixSum[i] / 2;
            }

            if (i == 2) {
                avgValue = (double) prefixSum[i] / 3;
                if (minValue > avgValue) {
                    minValue = avgValue;
                    index = 0;
                }
            }

            if (i - 2 >= 0) {
                avgValue = (double) (prefixSum[i] - prefixSum[i-2]) / 2;
                if (minValue > avgValue) {
                    minValue = avgValue;
                    index = i - 1;
                }
            }

            if (i - 3 >= 0) {
                avgValue = (double) (prefixSum[i] - prefixSum[i-3]) / 3;
                if (minValue > avgValue) {
                    minValue = avgValue;
                    index = i - 2;
                }
            }
        }

        return index;
    }
}
