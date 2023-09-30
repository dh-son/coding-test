package timeComplexity;

public class Main {

    public static void main(String[] args) {

//        FrogJmp frogJmp = new FrogJmp();
//        int result = frogJmp.solution(10, 85, 30);
//        System.out.println("=====> result: " + result);

//        PermMissingElem permMissingElem = new PermMissingElem();
//        int[] A = {2, 1};
//        int result = permMissingElem.solution(A);
//        System.out.println("=====> result: " + result);

        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int[] A= {3, 1, 2, 4, 3};
        int result = tapeEquilibrium.solution(A);
        System.out.println("=====> result: " + result);
    }
}
