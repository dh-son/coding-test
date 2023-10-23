package euclideanAlgorithm;

public class ChocolatesByNumbers {

    public int solution(int N, int M) {

        if (N == 1) {
            return 1;
        }

        int gcd = getGcd(M, N);

        return N / gcd;
    }

    private int getGcd(int N, int M) {
        if (M == 0) {
            return N;
        }

        return getGcd(M, N % M);
    }
}
