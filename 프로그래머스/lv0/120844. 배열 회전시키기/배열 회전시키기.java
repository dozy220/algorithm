class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        int d=1;
        if (direction.equals("right")) d = numbers.length-1;
        
        for (int i=0; i<numbers.length; i++) {
            answer[i] = numbers[(i+d)%numbers.length];
        }
        
        return answer;
    }
}