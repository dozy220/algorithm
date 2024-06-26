import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        
        for (String d : dic) {
            int cnt = 0;
            if (d.length() == spell.length) {
                String[] dArr = Arrays.stream(d.split("")).sorted().toArray(String[]::new);
                for (int i=0; i<dArr.length; i++) {
                    if (dArr[i].equals(spell[i])) cnt++;
                }
                if (spell.length == cnt) {
                    answer = 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}