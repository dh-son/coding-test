package fibonacciNumbers;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        FibFrog fibFrog = new FibFrog();
//        int[] A1 = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
//        System.out.println("=====> result: " + fibFrog.solution(A1));

        Ladder ladder = new Ladder();
        int[] A2 = {4, 4, 5, 5, 1};
        int[] B2 = {3, 2, 4, 3, 1};
        System.out.println("=====> result: " + Arrays.toString(ladder.solution(A2, B2)));
    }
}
