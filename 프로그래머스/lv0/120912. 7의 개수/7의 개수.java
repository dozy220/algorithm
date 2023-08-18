import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        String str = Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining());
        return (int) Arrays.stream(str.split("")).filter(e -> e.equals("7")).count();
    }
}
