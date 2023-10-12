package leader;

public class Main {

    public static void main(String[] args) {

        Dominator dominator = new Dominator();
        int [] A1 = {3, 4, 3, 2, 3, -1, 3, 3};
        System.out.println("=====> result: " + dominator.solution(A1));
    }
}
