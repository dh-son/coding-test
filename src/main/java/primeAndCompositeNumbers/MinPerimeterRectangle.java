package primeAndCompositeNumbers;

public class MinPerimeterRectangle {

    public int solution(int N) {

        int result = (1 + N) * 2;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                result = Math.min(result, (i + N / i) * 2);
            }
        }

        return result;
    }
}
