class Solution {
    public int solution(int n) {
        int answer = 2;
        double p = 1;
        
        for (int i=1; p<=n; i++) {
            p = Math.pow(i, 2);
            if (n==p) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}