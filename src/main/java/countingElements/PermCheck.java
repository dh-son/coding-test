package countingElements;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PermCheck {

    public int solution(int[] A) {

        Arrays.sort(A);

        return IntStream.range(0, A.length)
                .filter(i -> A[i] != i + 1)
                .map(i -> 0)
                .findFirst()
                .orElse(1);
    }
}
