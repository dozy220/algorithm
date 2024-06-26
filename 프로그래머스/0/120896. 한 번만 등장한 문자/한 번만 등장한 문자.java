import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        List<String> answer = new ArrayList<>();
        
        for (int i=0; i<s.length(); i++) {
            for (int j=0; j<s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {            
                    break;
                } else if (j == s.length()-1) answer.add(String.valueOf(s.charAt(i)));
            }
        }
        
        return answer.size() == 0 ? "" : answer.stream().sorted().collect(Collectors.joining());
    }
}