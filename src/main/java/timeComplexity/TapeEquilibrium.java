package timeComplexity;

import java.util.Arrays;

public class TapeEquilibrium {

    public int solution(int[] A) {

        int result = 0;

        int totalSum = 0;
        for (int value : A) {
            totalSum += value;
        }

        int[] temp = new int[A.length - 1];

        for (int i = 0; i < A.length - 1; i++) {
            if (i == 0) {
                temp[i] = A[i];
            } else {
                temp[i] = temp[i - 1] + A[i];
            }
        }

        for (int i = 0; i < temp.length; i++) {
            if (i == 0) {
                result = getTapeValue(temp[i], totalSum);
            } else {
                if (result > getTapeValue(temp[i], totalSum)) {
                    result = getTapeValue(temp[i], totalSum);
                }
            }
        }

        return result;
    }

    private int getTapeValue(int value, int totalSum) {
        return Math.abs(2 * value - totalSum);
    }
}
