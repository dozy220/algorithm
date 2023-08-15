import java.util.List;
import java.util.Arrays;

class Solution {
    public int solution(int num, int k) {
        List<String> list = Arrays.asList(String.valueOf(num).split(""));
        int n = list.indexOf(String.valueOf(k));
        return n == -1 ? n : n+1;
    }
}