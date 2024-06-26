class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        for (int i=0; i<board[0].length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (board[i][j] == 0) {
                    if (i > 0) {
                        if (j > 0) {
                            if (board[i-1][j-1] == 1) continue;
                        }

                        if (board[i-1][j] == 1) continue;

                        if (j < board[0].length-1) {
                            if (board[i-1][j+1] == 1) continue;
                        }
                    }
                    
                    if (j > 0) {
                        if (board[i][j-1] == 1) continue;    
                    }
                    if (j < board[0].length-1) {
                        if (board[i][j+1] == 1) continue;
                    }
                    
                    
                    if (i < board[0].length-1) {
                        if (j > 0) {
                            if (board[i+1][j-1] == 1) continue;
                        }
                        
                        if (board[i+1][j] == 1) continue;
                            
                        if (j < board[0].length-1) {
                            if (board[i+1][j+1] == 1) continue;    
                        }
                    } 
                    answer++;
                }
            }
        }
        
        return answer;
    }
}