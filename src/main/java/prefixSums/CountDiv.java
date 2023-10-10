package prefixSums;

public class CountDiv {

    public int solution(int A, int B, int K) {

        int baseValue = A / K;

        if (A % K == 0) {
            baseValue -= 1;
        }

        return (B / K) - baseValue;
    }
}
