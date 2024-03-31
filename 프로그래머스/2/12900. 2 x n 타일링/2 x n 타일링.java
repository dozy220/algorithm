import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int n) {
//         Map<Long, Long> tiling = new HashMap<>();
//         long answer = 0L;
        
//         tiling.put(1L, 1L);
//         tiling.put(2L, 2L);
        
//         for (long i=3; i <= n; i++) {
//             answer = (tiling.get(i-2) + tiling.get(i-1)) % 1_000_000_007L;
//             tiling.put(i, answer);
//         }
        
//         return (int) answer;
        
        int[] r = {1, 2, 3};
        
        for (int i=4; i<=n; i++) {
            int a = r[1];
            int b = r[2];
            
            r[0] = r[1];
            r[1] = r[2];
            r[2] = (int) ((a + b) % 1_000_000_007L);
        }
        
        if (n==1) return r[0];
        if (n==2) return r[1];
        if (n==3) return r[2];
        
        return r[2];
    }
}
