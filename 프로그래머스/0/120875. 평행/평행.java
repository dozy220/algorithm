class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int a1 = Math.abs(dots[0][0] - dots[1][0]);
        int a2 = Math.abs(dots[0][1] - dots[1][1]);
        int a3 = Math.abs(dots[2][0] - dots[3][0]);
        int a4 = Math.abs(dots[2][1] - dots[3][1]);
        
        int b1 = Math.abs(dots[0][0] - dots[2][0]);
        int b2 = Math.abs(dots[0][1] - dots[2][1]);
        int b3 = Math.abs(dots[1][0] - dots[3][0]);
        int b4 = Math.abs(dots[1][1] - dots[3][1]);
        
        int c1 = Math.abs(dots[0][0] - dots[3][0]);
        int c2 = Math.abs(dots[0][1] - dots[3][1]);
        int c3 = Math.abs(dots[1][0] - dots[2][0]);
        int c4 = Math.abs(dots[1][1] - dots[2][1]);
        
        if (a1*a4 == a2*a3 || b1*b4 == b2*b3 || c1*c3 == c2*c4) {
            answer = 1;
        }
             
        return answer;
    }
}