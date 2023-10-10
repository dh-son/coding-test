package sorting;

public class Main {

    public static void main(String[] args) {

        Distinct distinct = new Distinct();
        int[] A = {2, 1, 1, 2, 3, 1};
        int result = distinct.solution(A);
        System.out.println("=====> result: " + result);
    }
}
