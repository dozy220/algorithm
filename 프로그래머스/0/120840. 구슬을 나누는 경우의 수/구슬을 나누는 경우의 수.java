class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        
        for (int i=balls, j=1; i>share; i--) {
            answer *= i; 
            answer /= j++; 
        }
        
        return answer;
    }
}
