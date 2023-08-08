import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {

        int[] ans = Arrays.stream(numbers).sorted().toArray();
        
        return ans[ans.length-2] * ans[ans.length-1];
    }
}