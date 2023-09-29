package timeComplexity;

public class PermMissingElem {

    public int solution(int[] A) {

        long sumValue = ((long) (A.length + 1) * (A.length + 2)) / 2;

        for (int value : A) {
            sumValue -= value;
        }

        return (int) sumValue;
    }
}
