import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int[] answer = Arrays.copyOf(num_list, size+1);
    
        int last = size-1;
        int a = size-2;
        
        if (num_list[a] < num_list[last]) {
            answer[size] = num_list[last] - num_list[a];
        } else {
            answer[size] = num_list[last] * 2;
        }
                    
        return answer;
    }
}