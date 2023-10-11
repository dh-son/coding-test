package stacksAndQueues;

import java.util.Stack;

public class Fish {

    public int solution(int[] A, int[] B) {

        int liveNumber = 0;

        Stack<Integer> downStreams = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            if (B[i] == 0) {
                while (!downStreams.isEmpty()) {
                    if (A[i] > downStreams.peek()) {
                        downStreams.pop();
                    } else {
                        break;
                    }
                }

                if (downStreams.isEmpty()) {
                    liveNumber++;
                }
            }

            if (B[i] == 1) {
                downStreams.push(A[i]);
            }
        }

        return liveNumber + downStreams.size();
    }
}
