class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int tmp = 100;
        int x = 0;
        
        for (int i=0; i<array.length; i++) {
            int sub = Math.abs(array[i]-n);
            if (sub < tmp || (sub == tmp && array[i] < array[x])) {
                tmp = sub;
                answer = array[i];
                x = i; 
            }
        }
        
        return answer;
    }
}