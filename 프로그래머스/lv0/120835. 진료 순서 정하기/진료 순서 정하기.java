import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        List<Integer> emSort = Arrays.stream(emergency).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        
        for (int i=0; i<emergency.length; i++) {
            answer[i] = emSort.indexOf(emergency[i]) + 1;
        }
        
        return answer;
    }
}