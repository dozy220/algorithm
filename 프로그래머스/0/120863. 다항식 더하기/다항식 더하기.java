import java.util.Arrays;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int i = 0;
        
        for (String p : polynomial.split(" [+] ")) {
            if (p.charAt(p.length()-1) == 'x') {
                if (p.length() == 1) {
                    x++;
                } else {
                    x += Integer.parseInt(p.substring(0, p.length()-1));    
                }
            } else {
                i += Integer.parseInt(p);
            }
        }
        
        if (x > 1 && i > 0) {
            answer = x + "x + " + i;
        } else if ( x == 1 && i > 0) {
            answer = "x + " + i;
        } else if ( x == 1 && i == 0) {
            answer = "x";
        } else if ( x == 0) {
            answer = i + "";       
        } else if ( i == 0 ) {
            answer = x + "x";
        }
            
        return answer;
    }
}