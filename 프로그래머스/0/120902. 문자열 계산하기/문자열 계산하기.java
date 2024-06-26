class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] myArr = my_string.split(" ");
        answer = Integer.parseInt(myArr[0]);
        
        for (int i=2, j=1; j<myArr.length; i+=2, j+=2) {
            if (myArr[j].equals("+")) {
                answer += Integer.parseInt(myArr[i]);
            } else {
                answer -= Integer.parseInt(myArr[i]);
            }
        }
        
        return answer;
    }
}