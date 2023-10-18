package primeAndCompositeNumbers;

public class Main {

    public static void main(String[] args) {

//        CountFactors countFactors = new CountFactors();
//        int N1 = 24;
//        System.out.println("=====> result: " + countFactors.solution(N1));

//        MinPerimeterRectangle minPerimeterRectangle = new MinPerimeterRectangle();
//        int N2 = 36;
//        System.out.println("=====> result: " + minPerimeterRectangle.solution(N2));

//        Flags flags = new Flags();
//        int[] A = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
//        System.out.println("=====> result: " + flags.solution(A));

        Peaks peaks = new Peaks();
        int[] A = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        System.out.println("=====> result: " + peaks.solution(A));
    }
}
