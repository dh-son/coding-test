package stacksAndQueues;

import java.util.Stack;

public class StoneWall {

    public int solution(int[] H) {

        int count = 0;

        Stack<Integer> stack = new Stack<>();

        for (int j : H) {
            while (!stack.isEmpty() && stack.peek() > j) {
                stack.pop();
            }

            if (stack.isEmpty() || stack.peek() < j) {
                stack.push(j);
                count++;
            }
        }

        return count;
    }
}
