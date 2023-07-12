import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        int[] answer = new int[b1 - a1 + b2 - a2 + 2];
        
//         int n = 0;
//         for (int i=a1; i<=b1; i++) {
//             answer[n] = arr[i];
//             n++;
//         }
        
//         n = b1 - a1 + 1;
//         for (int i=a2; i<=b2; i++) {
//             answer[n] = arr[i];
//             n++;
//         }
        
        System.arraycopy(arr, a1, answer, 0, b1 - a1 +1 );
        System.arraycopy(arr, a2, answer, b1 - a1 +1 , b2 - a2 +1);
        
        return answer;
    }
}