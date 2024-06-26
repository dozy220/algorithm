import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.replaceAll("[a-zA-Z]", "").split("");
        return Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
    }
}