package stacksAndQueues;

import java.util.Stack;

public class Nesting {

    public int solution(String S) {

        if (S.length() % 2 > 0) {
            return 0;
        }

        Stack<Character> characters = new Stack<>();

        for (char value : S.toCharArray()) {
            if (characters.isEmpty() && value == ')') {
                return 0;
            }

            if (value == '(') {
                characters.push(value);
            }

            if (!characters.isEmpty() && value == ')') {
                characters.pop();
            }
        }

        return characters.isEmpty() ? 1 : 0;
    }
}
