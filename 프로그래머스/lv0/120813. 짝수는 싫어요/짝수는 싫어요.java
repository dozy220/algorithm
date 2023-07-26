class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        
        for (int i=0, j=1; j<=n; j++) {
            if (j%2==1) {
                answer[i++] = j;
            }
        }
        
        return answer;
    }
}