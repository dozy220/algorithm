class Solution {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer(my_string);
        String[] m = new String[] {"a", "e", "i", "o", "u"};
        
        for (int i=0; i<m.length; i++) {
            while (true) {
                int at = answer.indexOf(m[i]);
                if (at == -1) break; 
                answer.deleteCharAt(at);
            }    
        }
        
        return answer.toString();
    }
}