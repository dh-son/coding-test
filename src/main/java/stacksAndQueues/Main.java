package stacksAndQueues;

public class Main {

    public static void main(String[] args) {

        Brackets brackets = new Brackets();
        String S = "{[()()]}";
        System.out.println("=====> result: " + brackets.solution(S));
    }
}
