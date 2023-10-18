package primeAndCompositeNumbers;

import java.util.ArrayList;
import java.util.List;

public class Peaks {

    public int solution(int[] A) {

        int result = 0;

        List<Integer> peaks = new ArrayList<>();

        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                peaks.add(i);
            }
        }

        if (peaks.isEmpty()) {
            return result;
        }

        int K, start, end;
        for (int i = peaks.size(); i > 0; i--) {
            if (A.length % i == 0) {
                K = A.length / i;

                result = 0;

                for (int peak : peaks) {
                    start = result * K;
                    end = (result + 1) * K;

                    if (peak >= start && peak < end) {
                        result++;
                    }
                }

                if (i == result) {
                    return result;
                }
            }
        }

        return result;
    }
}
