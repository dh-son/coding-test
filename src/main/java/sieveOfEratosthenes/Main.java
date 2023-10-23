package sieveOfEratosthenes;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        CountNonDivisible countNonDivisible = new CountNonDivisible();
        int[] A1 = {3, 1, 2, 3, 6};
        System.out.println("=====> result: " + Arrays.toString(countNonDivisible.solution(A1)));

        CountSemiprimes countSemiprimes = new CountSemiprimes();
        int N = 26;
        int[] P = {1, 4, 16};
        int[] Q = {26, 10, 20};

        System.out.println("=====> result: " + Arrays.toString(countSemiprimes.solution(N, P, Q)));

    }
}
