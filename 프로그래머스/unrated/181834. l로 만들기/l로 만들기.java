class Solution {
    public String solution(String myString) {
        StringBuffer answer = new StringBuffer();
        
        for (int i=0; i<myString.length(); i++) {
            if (myString.charAt(i) < 'l') {
                answer.append('l');
            } else answer.append(myString.charAt(i));                
        }
        
        
        return answer.toString();
    }
}