class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        for (int i=0; i<picture.length; i++) {
            StringBuffer pic = new StringBuffer();
            
            for (int j=0; j<picture[i].length(); j++) {                
            
                pic.append(String.valueOf(picture[i].charAt(j)).repeat(k));
                
            }
            
            for (int x=i*k; x<i*k+k; x++) {
                answer[x] = pic.toString();    
            }
            
        }
        
        return answer;
    }
}