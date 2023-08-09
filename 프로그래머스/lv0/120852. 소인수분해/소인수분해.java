import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        
        int i = 2;
        while (true) {
            if (n == 1) break;
            else if (n%i == 0) {
                n /= i;
                answer.add(i);
            } else {
                i++;
            }
        }
        
        return answer.stream().distinct().sorted().mapToInt(e -> e).toArray();
    }
}