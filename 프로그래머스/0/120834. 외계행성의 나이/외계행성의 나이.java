class Solution {
    public String solution(int age) {
        StringBuffer answer = new StringBuffer();
        String ageStr = String.valueOf(age);
        
        for (int i=0; i<ageStr.length(); i++) {
            answer.append((char) (ageStr.charAt(i) + 49) + "");
        }
        
        return answer.toString();
    }
}
