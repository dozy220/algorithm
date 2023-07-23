class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        boolean x = a%2 == 1;
        boolean y = b%2 == 1;
        
        if (x && y) {
            answer = a*a + b*b;
        } else if (x || y) {
            answer = 2*(a+b);
        } else {
            answer = Math.abs(a-b);
        }   
        
        return answer;
    }
}