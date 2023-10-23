package euclideanAlgorithm;

public class CommonPrimeDivisors {

    public int solution(int[] A, int[] B) {

        int result = 0;

        for (int i = 0; i < A.length; i++) {
            int gcd = getGcd(A[i], B[i]);

            if (isQuotient(A[i], gcd) && isQuotient(B[i], gcd)) {
                result++;
            }
        }

        return result;
    }

    private boolean isQuotient(int A, int B) {
        int quotient= A / B;

        if (quotient == 1) {
            return true;
        }

        int gcd = getGcd(quotient, B);

        if (gcd == 1) {
            return false;
        }

        return isQuotient(quotient, gcd);
    }

    private int getGcd(int N, int M) {

        if (M == 0) {
            return N;
        }

        return getGcd(M, N % M);
    }
}
