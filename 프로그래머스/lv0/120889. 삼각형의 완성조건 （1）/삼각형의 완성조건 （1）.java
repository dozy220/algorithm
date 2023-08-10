import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
       
        int max = Arrays.stream(sides).max().getAsInt();
        int sum = Arrays.stream(sides).sum();

        if (sum-max > max) return 1;
        else return 2;
    }
}