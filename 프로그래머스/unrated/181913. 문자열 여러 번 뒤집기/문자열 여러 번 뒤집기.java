class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] answer = my_string.toCharArray();
        
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            char tmp;
            
            while (s < e) {
                tmp = answer[s];
                answer[s] = answer[e];
                answer[e] = tmp;
                s++;
                e--;
            }
        }
        
        return String.valueOf(answer);
    }
}