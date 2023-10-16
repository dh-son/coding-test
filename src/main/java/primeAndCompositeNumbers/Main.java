package primeAndCompositeNumbers;

public class Main {

    public static void main(String[] args) {

//        CountFactors countFactors = new CountFactors();
//        int N1 = 24;
//        System.out.println("=====> result: " + countFactors.solution(N1));

//        MinPerimeterRectangle minPerimeterRectangle = new MinPerimeterRectangle();
//        int N2 = 36;
//        System.out.println("=====> result: " + minPerimeterRectangle.solution(N2));

        Flags flags = new Flags();
        int[] A = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        int[] B = {1, 3, 2};
        int[] C = {0, 0, 0, 0, 0, 1, 0, 1, 0, 1};
        System.out.println("=====> result: " + flags.solution(A));
    }
}
