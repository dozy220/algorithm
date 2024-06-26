class Solution {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer();
        String tmp;
        
        for (int i=0; i<my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                tmp = String.valueOf(my_string.charAt(i));
                answer.append(tmp.toLowerCase());
            } else {
                tmp = String.valueOf(my_string.charAt(i));
                answer.append(tmp.toUpperCase());
            }
        }
        
        return answer.toString();
    }
}