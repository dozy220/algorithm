import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> answer = new ArrayList<>();
        int j = 0;
        
        for (int i=0; i<arr.length && j < k; i++) {
            if (!answer.contains(arr[i])) {
                answer.add(arr[i]);
                j++;
            }
        }
        
        if (j < k) {
            for (int i=j; i<k; i++) answer.add(-1);
        }             
        
        return answer.stream().mapToInt(e -> e).toArray();
    }
}