package stacksAndQueues;

public class Main {

    public static void main(String[] args) {

        Brackets brackets = new Brackets();
        String S = "{[()()]}";
        System.out.println("=====> result: " + brackets.solution(S));

        Fish fish = new Fish();
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        System.out.println("=====> result: " + fish.solution(A, B));
    }
}
