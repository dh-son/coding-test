package stacksAndQueues;

import java.util.ArrayList;
import java.util.List;

public class Brackets {

    public int solution(String S) {

        List<Character> characters = new ArrayList<>();

        for (char value : S.toCharArray()) {
            if (value == '{' || value == '[' || value == '(') {
                characters.add(value);
            } else {
                if (characters.isEmpty()) {
                    return 0;
                }

                if (value == ')' && characters.get(characters.size() - 1) == '(') {
                    characters.remove(characters.size() - 1);
                } else if (value == ']' && characters.get(characters.size() - 1) == '[') {
                    characters.remove(characters.size() - 1);
                } else if (value == '}' && characters.get(characters.size() - 1) == '{') {
                    characters.remove(characters.size() - 1);
                } else {
                    return 0;
                }
            }
        }

        if (!characters.isEmpty()) {
            return 0;
        } else {
            return 1;
        }
    }
}
