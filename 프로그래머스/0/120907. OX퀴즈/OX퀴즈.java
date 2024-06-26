import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {
        List<String> answer = new ArrayList<>();
        
        for (int i=0; i<quiz.length; i++) {
            String[] sArr = quiz[i].split(" ");
            int cal = 0;
            
            if (sArr[1].equals("+")) {
                cal = Integer.parseInt(sArr[0]) + Integer.parseInt(sArr[2]);
            } else {
                cal = Integer.parseInt(sArr[0]) - Integer.parseInt(sArr[2]);
            }
            
            if (cal == Integer.parseInt(sArr[4])) answer.add("O");  
            else answer.add("X");
        }
        
        return answer.stream().toArray(String[]::new);
            
        // return Arrays.stream(quiz)
        //     .map(s -> s.split(" = "))
        //     .map(a -> new String[] {
        //         String.valueOf(
        //             Arrays.stream(a[0].replaceAll("- ", "-").replaceAll("[+] ", "").split(" "))
        //             .mapToInt(Integer::parseInt)
        //             .sum()), 
        //         a[1]})
        //     .map(q -> q[0].equals(q[1]) ? "O" : "X")
        //     .toArray(String[]::new);
    }
}