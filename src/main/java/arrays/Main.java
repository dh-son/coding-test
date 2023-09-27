package arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        CyclicRotation cyclicRotation = new CyclicRotation();

        int[] A = {3, 8, 9, 7, 6};
        int K = 3;

        int[] result = cyclicRotation.solution(A, K);

        System.out.println("=====> result: " + Arrays.toString(result));
    }
}
