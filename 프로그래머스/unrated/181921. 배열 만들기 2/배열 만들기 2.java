import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i=l; i<=r; i++) {
            String str = String.valueOf(i);
            for (int j=0; j<str.length(); j++) {
                if (str.charAt(j) != '0' && str.charAt(j) != '5') break;
                if (j == str.length()-1) {
                    answer.add(Integer.valueOf(str));
                }
            }
        }
         
        return answer.isEmpty() ? new int[]{-1} : answer.stream().mapToInt(Integer::valueOf).toArray();
    }
}