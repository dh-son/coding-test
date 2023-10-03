package countingElements;

public class Main {

    public static void main(String[] args) {

        FrogRiveOne frogRiveOne = new FrogRiveOne();
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        int result = frogRiveOne.solution(5, A);
        System.out.println("=====> result: " + result);
    }
}
