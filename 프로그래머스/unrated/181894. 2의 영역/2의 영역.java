import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
                
        int start = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 2) {
                start = i; 
                break;
            }
        }
        
        int end = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 2) {
                end = i; 
            }
        }
               
        if (start != -1) {
            answer = Arrays.copyOfRange(arr, start, end + 1);    
        } else {
            answer = new int[]{-1};
        }
        
        return answer;
    }
}