import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int m = Arrays.stream(array).max().getAsInt();
        //int i = Arrays.asList(array).indexOf(m);
        int i = 0;
        
        for (int j=0; j<array.length; j++) {
            if (array[j] == m) {
                i = j;
                break;
            }
        } 
        
        return new int[] {m, i};
    }
}