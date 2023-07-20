import java.util.Arrays;

class Solution {
    public int solution(String num_str) {
    
        return Arrays.stream(num_str.split("")).map(Integer::valueOf).mapToInt(e -> e).sum();
    }
}