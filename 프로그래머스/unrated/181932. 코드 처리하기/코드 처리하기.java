class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        boolean mode = false;

        for (int i=0; i<code.length(); i++) {
            if (mode) {
                if (code.charAt(i) == '1') {
                    mode = false;
                    continue;
                }
                if (i%2 == 1) answer.append(code.charAt(i));
            } else {
                if (code.charAt(i) == '1') {
                    mode = true;
                    continue;
                }
                if (i%2 == 0) answer.append(code.charAt(i));
            }
        }

        if (answer.toString().isEmpty()) return "EMPTY";
        return answer.toString();
    }
}