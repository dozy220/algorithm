class Solution {
    public int solution(int n) {
        
        int p = 1;
        int pi = 6;
        int i = 6;
        
        while (pi%n!=0) {
            pi += i;
            p++;
        }
        
        return p;
    }
}