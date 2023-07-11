import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String my_string) {
        Map<Character, Integer> abc = new HashMap<>();

        for (int i=65; i<123; i++) {
            if (i < 91 || 96 < i) abc.put((char) i, 0);
        }

        for (int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if (abc.containsKey(ch)) {
                abc.put(ch, abc.get(ch)+1);
            }
        }

        return abc.values().stream().mapToInt(e->e).toArray();
    }
}