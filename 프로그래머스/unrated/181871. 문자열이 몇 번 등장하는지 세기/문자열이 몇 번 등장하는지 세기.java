class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        int start = myString.length() - pat.length();
        int end = myString.length();
        
        for (int i=start, j=end; 0<=i; i--, j--) {
            if (myString.substring(i, j).equals(pat)) answer++;
        }
        
        return answer;
    }
}