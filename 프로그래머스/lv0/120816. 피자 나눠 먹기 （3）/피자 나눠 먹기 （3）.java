class Solution {
    public int solution(int slice, int n) {
        int p = 1;
        
        while(slice*p < n) {
            p++;
        }
        
        return p;
    }
}