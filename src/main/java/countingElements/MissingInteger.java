package countingElements;

import java.util.HashSet;

public class MissingInteger {

    public int solution(int[] A) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int value : A) {
            if (value > 0) {
                hashSet.add(value);
            }
        }

        int i = 1;

        if (hashSet.isEmpty()) {
            return i;
        }

        for (int value : hashSet) {
            if (!hashSet.contains(i)) {
                return i;
            }

            i++;
        }

        return i;
    }
}
