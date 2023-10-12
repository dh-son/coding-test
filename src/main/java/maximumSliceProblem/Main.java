package maximumSliceProblem;

public class Main {

    public static void main(String[] args) {

        MaxProfit maxProfit = new MaxProfit();
        int[] A1 = {23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println("=====> result: " + maxProfit.solution(A1));

        MaxSliceSum maxSliceSum = new MaxSliceSum();
        int[] A2 = {3, 2, -6, 4, 0};
        int[] A3 = {-2, 1};
        System.out.println("=====> result: " + maxSliceSum.solution(A3));
    }
}
