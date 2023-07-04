class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n%2 == 1) {
            for (int i=n; i>=0; i--) {
                answer += i; 
                i--;
            }
        } else {
            for (int i=n; i>=0; i--) {
                answer = i*i + answer;
                i--;
            }
        }
        return answer;
    }
}