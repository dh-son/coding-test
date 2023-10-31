package fibonacciNumbers;

public class Main {

    public static void main(String[] args) {

        FibFrog fibFrog = new FibFrog();
        int[] A1 = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
        System.out.println("=====> result: " + fibFrog.solution(A1));
    }
}
