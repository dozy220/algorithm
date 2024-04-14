import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        int people1 = 0;
        int people2 = people.length - 1;
        
        while (people1 < people2) {
            if (people[people1] + people[people2] <= limit) {
                people1++;
                people2--;
                answer++;
            } else {
                people2--;
            }            
        }
        
        return people.length - answer;
    }
}    
    
    