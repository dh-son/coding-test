package sieveOfEratosthenes;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        CountNonDivisible countNonDivisible = new CountNonDivisible();
        int[] A1 = {3, 1, 2, 3, 6};
        System.out.println("=====> result: " + Arrays.toString(countNonDivisible.solution(A1)));

    }
}
