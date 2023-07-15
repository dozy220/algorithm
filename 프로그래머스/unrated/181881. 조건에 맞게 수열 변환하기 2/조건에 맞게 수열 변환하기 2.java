import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        int[] pre = new int[arr.length];
        int[] next = arr;
        
        do {
            pre = Arrays.copyOf(next, next.length);
            next = func(arr);
            answer++;    
        } while (Arrays.compare(pre, next) != 0);
            
        return answer;
    }
    
    public int[] func(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            if (50 <= arr[i] && arr[i]%2==0) {
                arr[i] /= 2;
            } else if (arr[i] < 50 && arr[i]%2==1) {
                arr[i] = arr[i]*2 + 1;
            }
        }
        return arr;
    }
}