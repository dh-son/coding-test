package primeAndCompositeNumbers;

import java.util.ArrayList;
import java.util.List;

public class Flags {

    public int solution(int[] A) {

        List<Integer> peaks = new ArrayList<>();

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                peaks.add(i);
            }
        }

        if (peaks.size() < 3) {
            return  peaks.size();
        }

        // point: Max Flag
        int maxFlag = (int) Math.sqrt(peaks.get(peaks.size() - 1) - peaks.get(0)) + 1;

        for (int i = maxFlag; i >= 2; i--) {
            int count = 1;
            int baseValue = peaks.get(0);

            for (int j = 1; j < peaks.size(); j++) {
                if (peaks.get(j) >= baseValue + i) {
                    baseValue = peaks.get(j);
                    count++;
                }
            }

            if (count >= i) {
                return i;
            }
        }

        return 2;
    }
}
