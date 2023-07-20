import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(String[] strArr) {
        int maxSize = Arrays.stream(strArr).map(e -> e.length()).sorted(Comparator.reverseOrder()).findFirst().orElse(-1);
        int[] arr = new int[maxSize];

        Arrays.stream(strArr).map(e -> e.length()).forEach(e -> arr[e-1]++);

        return Arrays.stream(arr).max().getAsInt();
    }
}