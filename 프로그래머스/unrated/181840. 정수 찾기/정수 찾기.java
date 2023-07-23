import java.util.Arrays;

class Solution {
    public int solution(int[] num_list, int n) {

        return Arrays.stream(num_list).filter(e -> e == n).map(e -> 1).findFirst().orElse(0);
    }
}