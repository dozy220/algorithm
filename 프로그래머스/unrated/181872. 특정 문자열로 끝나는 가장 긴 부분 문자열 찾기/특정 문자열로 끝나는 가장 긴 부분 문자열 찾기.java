class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
 
        int start = myString.length() - pat.length();
        int end = myString.length();
        
        for (int i=start, j=end; 0<=i; i--, j--) {
            if(myString.substring(i, j).equals(pat)) {
                answer = myString.substring(0, j);    
                break;
            }
        }
        
        return answer;
    }
}