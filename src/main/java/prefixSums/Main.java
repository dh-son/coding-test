package prefixSums;

public class Main {

    public static void  main(String[] args) {

        PassingCars passingCars = new PassingCars();
        int[] A = {0, 1, 0, 1, 1 };
        System.out.println("=====> result: " + passingCars.solution(A));
    }
}
