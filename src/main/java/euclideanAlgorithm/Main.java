package euclideanAlgorithm;

public class Main {

    public static void main(String[] args) {

        ChocolatesByNumbers chocolatesByNumbers = new ChocolatesByNumbers();
        int N = 10;
        int M = 4;
        System.out.println("=====> result: " + chocolatesByNumbers.solution(N, M));

        CommonPrimeDivisors commonPrimeDivisors = new CommonPrimeDivisors();
        int[] A = {15, 10, 3};
        int[] B = {75, 30, 5};
        System.out.println("=====> result: " + commonPrimeDivisors.solution(A, B));
    }
}
