class Solution {
    public int solution(String myString, String pat) {
        String rpat = "";
        
        for (int i=0; i<pat.length(); i++) {
            if (pat.charAt(i) == 'A') rpat += "B";
            if (pat.charAt(i) == 'B') rpat += "A";
        } 
        
        return myString.contains(rpat) ? 1 : 0;
    }
}