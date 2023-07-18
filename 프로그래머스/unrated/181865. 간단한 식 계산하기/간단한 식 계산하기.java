class Solution {
    public int solution(String binomial) {
        String[] aopb = binomial.split(" ");
        int answer = 0;
        
        switch (aopb[1]) {
            case "+":
                answer = Integer.valueOf(aopb[0]) + Integer.valueOf(aopb[2]);   
                break;
            case "-":
                answer = Integer.valueOf(aopb[0]) - Integer.valueOf(aopb[2]);
                break;            
            case "*":
                answer = Integer.valueOf(aopb[0]) * Integer.valueOf(aopb[2]);
                break;    
        }
            
                            
        return answer;
    }
}