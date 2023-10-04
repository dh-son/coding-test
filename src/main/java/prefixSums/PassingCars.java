package prefixSums;

public class PassingCars {

    public int solution(int[] A) {

        int east = 0;
        int result = 0;

        for (int value : A) {
            if (value == 0) {
                east += 1;
            }

            if (value == 1) {
                result += east;
            }

            if (result > 1000000000) {
                return -1;
            }
        }

        return result;
    }
}
