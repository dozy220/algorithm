import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> cnt = new HashMap<>();
        
        for (int i : array) {
            if (cnt.containsKey(i)) cnt.put(i, cnt.get(i)+1);
            else cnt.put(i, 1);
        }
        
        int n = 0;
        int max = 0;
        for (int i : cnt.keySet()) {
            if (cnt.get(i) > max) {
                n = i;
                max = cnt.get(i);
            } else if (cnt.get(i) == max) {
                n = -1;   
            }
        }
                   
        return n;
    }
}