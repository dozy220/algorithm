class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=0, f=1; f<=n; f*=i) {
            answer = i++;
        }
        
        return answer;
    }
}