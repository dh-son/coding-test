package sorting;

import java.util.HashSet;

public class Distinct {

    public int solution(int[] A) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int value : A) {
            hashSet.add(value);
        }

        return hashSet.size();
    }
}
