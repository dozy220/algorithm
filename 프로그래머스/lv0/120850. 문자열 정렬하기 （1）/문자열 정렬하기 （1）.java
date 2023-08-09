import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String[] arr = my_string.replaceAll("[a-z]", "").split("");
        return Arrays.stream(arr).map(e -> Integer.parseInt(e)).mapToInt(e -> e).sorted().toArray();
    }
}