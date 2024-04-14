class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] basket = new int[moves.length];
        int basketCnt = 0;
        
        for (int move : moves) {
            move--;
            for (int[] floor : board) {
                if (floor[move] == 0) {
                    continue;
                } else {
                    if (basketCnt == 0) {
                        basket[basketCnt] = floor[move];
                        floor[move] = 0;
                        basketCnt++;
                    } else {
                        if (basket[basketCnt-1] == floor[move]) {
                            floor[move] = 0;
                            basket[basketCnt-1] = 0;
                            basketCnt--;
                            answer += 2;
                        } else {
                            basket[basketCnt] = floor[move];
                            floor[move] = 0;
                            basketCnt++;
                        }
                    }
                    break;
                }
            } 
        }
        return answer;
    }
}