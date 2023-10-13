package primeAndCompositeNumbers;

public class CountFactors {

    public int solution(int N) {

        int result = 1;

        if (N == 1) {
            return result;
        }

        for (int i = 2; i < Math.sqrt(N); i++) {
            if (N % i == 0) {
                result++;
            }
        }

        result *= 2;

        if (Math.sqrt(N) % 1 == 0) {
            result += 1;
        }

        return result;
    }
}
