import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        LinkedHashSet<String> str = new LinkedHashSet<>();
        StringBuffer answer = new StringBuffer();
        
        for (String s : my_string.split("")) str.add(s);
        for (String s : str) answer.append(s);
        
        return answer.toString();
    }
}