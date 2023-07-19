import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i=0; i<arr.length; i++) {

                if (!answer.isEmpty() && arr[i] == answer.get(answer.size()-1)) {
                    answer.remove(answer.size()-1);  
                } else {
                    answer.add(arr[i]);   
                }
            
        }
        
        return answer.isEmpty() ? new int[] {-1} : answer.stream().mapToInt(e -> e).toArray();
    }
}