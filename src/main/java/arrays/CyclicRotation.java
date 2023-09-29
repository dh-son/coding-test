package arrays;

import java.util.Arrays;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {

        return getRotation(A, 3);
    }

    private int[] getRotation(int[] array, int k) {

        if (k == 0) return array;

        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1) {
                result[0] = array[i];
            } else {
                result[i+1] = array[i];
            }
        }

        return getRotation(result, k -1);
    }
}
