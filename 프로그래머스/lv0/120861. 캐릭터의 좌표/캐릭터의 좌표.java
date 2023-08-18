import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        
        Map<String, Integer[]> key = new HashMap<>();
        key.put("up", new Integer[] {0, 1});
        key.put("down", new Integer[] {0, -1});
        key.put("left", new Integer[] {-1, 0});
        key.put("right", new Integer[] {1, 0});
        
        int w = (board[0]-1)/2; 
        int h = (board[1]-1)/2; 
        
        for (String input : keyinput) {
            Integer[] k = key.get(input); 
            
            if (-w <= answer[0]+k[0] && answer[0]+k[0] <= w) {
                answer[0] += k[0];    
            }
            if (-h <= answer[1]+k[1] && answer[1]+k[1] <= h) {
                answer[1] += k[1];    
            }
        }
        
        return answer;
    }
}


    
