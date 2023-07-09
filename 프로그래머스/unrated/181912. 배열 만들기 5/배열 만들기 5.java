
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        for (String intStr : intStrs) {
            int num = Integer.valueOf(intStr.substring(s, s+l));
            if (k < num) answer.add(num);
        }
        
        return answer.stream().mapToInt(e -> e).toArray();
    }
}