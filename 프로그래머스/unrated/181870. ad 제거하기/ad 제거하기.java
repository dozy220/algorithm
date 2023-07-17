import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        
        for (int i=0; i<strArr.length; i++) {
            if (check(strArr[i], "ad")) continue;
            answer.add(strArr[i]);
        }
        
        return answer.toArray(String[]::new);
    }
    
    public boolean check(String myStr, String pat) {
        int start = myStr.length() - pat.length();
        int end = myStr.length();
        
        for (int i=start, j=end; 0<=i; i--, j--) {
            if (myStr.substring(i, j).equals(pat)) return true;
        }
        
        return false;
    }
}