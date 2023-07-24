import java.util.Arrays;

class Solution {
    public int solution(String[] order) {
        
        return Arrays.stream(order).map(e -> {
            if (e.contains("americano")) return 4500;
            if (e.contains("cafelatte")) return 5000;
            else return 4500;
        }).mapToInt(e -> e).sum();
        
    }
}