class Solution {
    public String solution(String my_string, int n) {
        StringBuffer sb = new StringBuffer();
        
        for (int i=0; i<my_string.length(); i++) {
            sb.append(String.valueOf(my_string.charAt(i)).repeat(n));
        }
        
        return sb.toString();
    }
}