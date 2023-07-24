import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {

        return Arrays.stream(arr).map(e -> {
            if (k%2 == 1) return e*k;
            else return e+k;
        }).toArray();
        
    }
}