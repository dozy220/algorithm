import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        return Arrays.stream(my_string.split("[a-zA-Z]")).filter(e -> !e.equals("")).mapToInt(Integer::parseInt).sum();
    }
}