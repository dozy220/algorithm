class Solution {
    public String solution(String rsp) {
        StringBuffer answer = new StringBuffer();
        String[] arrRsp = new String[] {"2", "0", "5"};
        
        for (String str : rsp.split("")) {
            for (int i=0; i<arrRsp.length; i++) {
                if (str.equals(arrRsp[i])) {
                    answer.append(arrRsp[(i+1)%3]);        
                }
            }            
        }
        
        return answer.toString();
    }
}