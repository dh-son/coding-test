package prefixSums;

import java.util.Arrays;

public class Main {

    public static void  main(String[] args) {

//        PassingCars passingCars = new PassingCars();
//        int[] A = {0, 1, 0, 1, 1 };
//        System.out.println("=====> result: " + passingCars.solution(A));

//        CountDiv countDiv = new CountDiv();
//        System.out.println("=====> result: " + countDiv.solution(6, 11, 2));

        GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] result = genomicRangeQuery.solution(S, P, Q);

        System.out.println("=====> result: " + Arrays.toString(result));
    }
}
