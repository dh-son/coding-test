package timeComplexity;

public class FrogJmp {

    public int solution(int X, int Y, int D) {

        int result = (Y - X) / D;

        if (D * result + X < Y) {
            return result + 1;
        }

        return result;
    }
}
