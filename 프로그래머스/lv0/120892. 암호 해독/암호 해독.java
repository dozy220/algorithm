class Solution {
    public String solution(String cipher, int code) {
        StringBuffer answer = new StringBuffer();
        String[] arr = cipher.split("");
        
        for (int i=code; i<=arr.length; i+=code) {
            answer.append(arr[i-1]);
        }
        
        return answer.toString();
    }
}