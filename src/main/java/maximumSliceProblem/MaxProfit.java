package maximumSliceProblem;

public class MaxProfit {

    public int solution(int[] A) {

        // 구간별 최대값 구하기: 배열 역순
        // ex: i==0 -> 5, i==1 ->5~4, i==2 ->5~3 ..
        int[] sliceMaxValue = new int[A.length];
        int maxValue = 0;
        for (int i = 0; i < A.length; i++) {
            maxValue = Math.max(maxValue, A[A.length -1 - i]);
            sliceMaxValue[i] = maxValue;
        }

        int maxProfit = 0;
        for (int i = 0; i < A.length; i++) {
            if (i == 0) {
                maxProfit = sliceMaxValue[A.length - 1 - i] - A[i];
            } else {
                maxProfit = Math.max(maxProfit, sliceMaxValue[A.length - 1 - i] - A[i]);
            }
        }

        return maxProfit;
    }
}
