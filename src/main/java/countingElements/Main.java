package countingElements;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        FrogRiveOne frogRiveOne = new FrogRiveOne();
//        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
//        int result = frogRiveOne.solution(5, A);
//        System.out.println("=====> result: " + result);

//        PermCheck permCheck = new PermCheck();
//        int[] A = {4, 1, 3};
//        int result = permCheck.solution(A);
//        System.out.println("=====> result: " + result);

        MaxCounters maxCounters = new MaxCounters();
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] result = maxCounters.solution(5, A);
        System.out.println("=====> result: " + Arrays.toString(result));
    }
}
