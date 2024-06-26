class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int n = Math.max(a, b);
        int i = 2;
        
        while (n > i) {
            if (a%i == 0 && b%i == 0) {
                a /= i;
                b /= i;
            } else {
                i++;
            }
        }
        
        if (b == 1) return 1;
        
        while (b%2 == 0) {
            b /= 2;
        } 
        
        while (b%5 == 0) {
            b /= 5;
        }

        if (b == 1) answer = 1;
        
        return answer;
    }
}






