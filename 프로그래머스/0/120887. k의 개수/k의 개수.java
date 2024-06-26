import java.util.Arrays;
import java.util.Objects;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int n=i; n<=j; n++) {

            if (n < 10) {
                if (String.valueOf(n).contains(String.valueOf(k)))
                    answer++;
            } else {
                answer += (int) Arrays.stream(String.valueOf(n).split(""))
                        .filter(e -> Objects.equals(e, String.valueOf(k)))
                        .count();
            }
        }
        
        return answer;
    }
}