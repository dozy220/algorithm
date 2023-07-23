import java.util.Arrays;

class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        return String.join("", Arrays.stream(str_list).filter(e -> !e.contains(ex)).toArray(String[]::new));
    }
}