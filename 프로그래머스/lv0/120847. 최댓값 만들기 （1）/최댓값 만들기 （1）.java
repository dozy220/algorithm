import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {

        Arrays.sort(numbers);
        
        return numbers[numbers.length-2] * numbers[numbers.length-1];
//         int[] ans = Arrays.stream(numbers).sorted().toArray();
        
//         return ans[ans.length-2] * ans[ans.length-1];
    }
}