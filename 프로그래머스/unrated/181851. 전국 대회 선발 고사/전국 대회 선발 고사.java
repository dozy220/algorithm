import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int i=0; i<rank.length; i++) {
            if (attendance[i]) m.put(rank[i], i);
        }

        List<Integer> x = m.entrySet().stream().map(Map.Entry::getKey).sorted().limit(3).collect(Collectors.toList());

        int result = 10000 * m.get(x.get(0));
        result += 100 * m.get(x.get(1));
        result += m.get(x.get(2));

        return result;
    }
}