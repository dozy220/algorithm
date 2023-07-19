import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        
        answer = Arrays.stream(myStr.split("a"))
            .map(e -> e.split("b"))
            .flatMap(Arrays::stream)
            .map(e -> e.split("c"))
            .flatMap(Arrays::stream)
            .filter(e -> !e.isEmpty())
            .toArray(String[]::new);
        
        return answer.length != 0 ? answer : new String[] {"EMPTY"};
    }
}