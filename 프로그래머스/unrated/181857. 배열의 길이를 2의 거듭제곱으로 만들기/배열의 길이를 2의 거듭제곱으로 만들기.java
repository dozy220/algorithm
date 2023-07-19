class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int size = 1;
        
        for (int i=2; i<arr.length; i*=2) {
            size = i;
        }
        
        answer = new int[size*2];
        
        System.arraycopy(arr, 0, answer, 0, arr.length);
        
        return arr.length < 2 ? arr : answer;
    }
}