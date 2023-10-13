package primeAndCompositeNumbers;

public class Main {

    public static void main(String[] args) {

        CountFactors countFactors = new CountFactors();
        int N1 = 24;
        System.out.println("=====> result: " + countFactors.solution(N1));

        MinPerimeterRectangle minPerimeterRectangle = new MinPerimeterRectangle();
        int N2 = 36;
        System.out.println("=====> result: " + minPerimeterRectangle.solution(N2));
    }
}
