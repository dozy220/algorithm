import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i=1; i<=n; i++) {
            //if (n%i == 0 && answer.indexOf(i) == -1) {
            if (n%i == 0) {
                answer.add(i);
                answer.add(n/i);
            }
        }
        
        return answer.stream().sorted().distinct().mapToInt(e -> e).toArray();
    }
}