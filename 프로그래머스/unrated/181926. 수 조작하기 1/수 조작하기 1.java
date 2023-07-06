class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for (int i=0; i<control.length(); i++) {
            char ch = control.charAt(i);
            
            if (ch == 'w') {
                answer++;
            } else if (ch == 's') {
                answer--;
            } else if (ch == 'a') {
                answer -= 10;
            } else {
                answer += 10;
            }
        }
        
        return answer;
    }
}