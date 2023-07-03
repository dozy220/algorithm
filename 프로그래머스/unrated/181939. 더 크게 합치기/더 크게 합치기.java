class Solution {
    public int solution(int a, int b) {
        int x = Integer.valueOf(String.valueOf(a).concat(String.valueOf(b)));
        int y = Integer.valueOf(String.valueOf(b).concat(String.valueOf(a)));
        
        return Math.max(x,y);
    }
}