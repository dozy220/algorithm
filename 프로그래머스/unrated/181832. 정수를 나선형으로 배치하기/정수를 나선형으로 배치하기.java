class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int x = 1;
        int cols = 0;
        int rows = 0;
        int cole = n-1;
        int rowe = n-1;
            
        while (x <= n*n) {
            for (int i=cols; i<=cole; i++) {
                answer[rows][i] = x++;
            }
            
            rows++;
            
            for (int i=rows; i<=rowe; i++) {
                answer[i][cole] = x++;
            }
            
            cole--;
            
            for (int i=cole; cols<=i; i--) {
                answer[rowe][i] = x++;
            }
            
            rowe--;
            
            for (int i=rowe; rows<=i; i-- ) {
                answer[i][cols] = x++;
            }
            
            cols++;
        }
        
        return answer;
    }
}