class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        
        for (int i=0; i<index_list.length; i++) {
            int n = index_list[i];
            answer.append(my_string.charAt(n));
        }
        
        return answer.toString();
    }
}