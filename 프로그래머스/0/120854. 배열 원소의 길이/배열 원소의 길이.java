import java.util.Arrays;

class Solution {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).map(e -> e.length()).mapToInt(Integer::valueOf).toArray();
    }
}