package countingElements;


public class MaxCounters {

    public int[] solution(int N, int[] A) {

        int[] result = new int[N];
        int maxCounter = 0;
        int tempConter = 0;

        for (int value : A) {
            if (value <= N) {
                if (result[value - 1] < maxCounter) {
                    result[value - 1] = maxCounter;
                }
                result[value -1] += 1;
                tempConter = Math.max(result[value -1], tempConter);
            }

            if (value == N + 1) {
                maxCounter = tempConter;
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] < maxCounter) {
                result[i] = maxCounter;
            }
        }

        return result;
    }
}
