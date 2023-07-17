import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        
        String[] strArr = myString.split("x");
        
        for (int i=0; i<strArr.length; i++) {
            answer.add(strArr[i].length());
        }
        
        if (myString.charAt(myString.length()-1) == 'x') answer.add(0);
        
        return answer.stream().mapToInt(e -> e).toArray();
    }
}