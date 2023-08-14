class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        for (int i=0; i<numbers.length(); i++) {
            char x = numbers.charAt(i);
            char y = numbers.charAt(i+1);
            
            if (x == 'z') {
                answer *= 10;
                i += 3;
            } else if (x == 'o') {
                answer = answer*10 + 1;
                i += 2;
            } else if (x == 't' &&  y == 'w') {
                answer = answer*10 + 2;
                i += 2;
            } else if (x == 't' && y == 'h') {
                answer = answer*10 + 3;
                i += 4;
            } else if (x == 'f' && y == 'o') {
                answer = answer*10 + 4;
                i += 3;
            } else if (x == 'f' && y == 'i') {
                answer = answer*10 + 5;
                i += 3;
            } else if (x == 's' && y == 'i') {
                answer = answer*10 + 6;
                i += 2;
            } else if (x == 's' && y == 'e') {
                answer = answer*10 + 7;
                i += 4;
            } else if (x == 'e') {
                answer = answer*10 + 8;
                i += 4;
            } else if (x == 'n') {
                answer = answer*10 + 9;
                i += 3;
            }
        }
        
        return answer;
    }
}