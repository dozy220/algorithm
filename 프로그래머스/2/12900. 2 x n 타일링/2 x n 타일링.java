class Solution {
    public int solution(int n) {
        int[] tiling = {1, 2, 3};
        
        if (n < 4) {
            return tiling[n-1];
        }
        
        for (int i=4; i<=n; i++) {
            tiling[0] = tiling[1];
            tiling[1] = tiling[2];
            tiling[2] = (int) ((tiling[0] + tiling[1]) % 1_000_000_007L);
        }      
        
        return tiling[2];
    }
}
