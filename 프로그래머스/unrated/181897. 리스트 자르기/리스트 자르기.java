class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer;
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        if (n == 1) {
            answer = new int[b+1];
            
            for (int i=0; i<=b; i++) {
                answer[i] = num_list[i];
            }
        } else if (n == 2) {
            answer = new int[num_list.length - a];
            
            for (int i=a; i<num_list.length; i++) {
                answer[i-a] = num_list[i];
            }
        } else if (n == 3) {
            answer = new int[b - a + 1];
            
            for (int i=a; i<=b; i++) {
                answer[i-a] = num_list[i];
            }
        } else {
            answer = new int[(b - a)/c + 1];
            
            int j = 0;
            for (int i=a; i<=b; i+=c) {
                answer[j] = num_list[i];
                j++;
            }
        }
        
        return answer;
    }
}