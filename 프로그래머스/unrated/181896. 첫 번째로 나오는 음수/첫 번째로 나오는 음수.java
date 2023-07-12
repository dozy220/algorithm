import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            }
        }
        
        //IntStream.rangeClosed(0, num_list.length).filter(e -> e < 0).findFist().orElse(-1);
        
        return answer;
    }
}