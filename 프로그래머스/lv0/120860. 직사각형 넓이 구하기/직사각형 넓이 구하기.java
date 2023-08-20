class Solution {
    public int solution(int[][] dots) {
        int[] a = dots[0];
        int[] b = {};
        
        for (int i=1; i<dots.length; i++) {
            if (dots[i][0] != a[0] && dots[i][1] != a[1]) {
                b = dots[i];
                break;
            }
        }
        
        return Math.abs((a[0]-b[0]) * (a[1]-b[1]));
    }
}