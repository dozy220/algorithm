import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        int x = 0;
        for (int[] query : queries) {
            int tmp = 1_000_001;
            for (int i=query[0]; i<=query[1]; i++) {
                if (query[2] < arr[i]) {
                    if (arr[i] < tmp) {
                        tmp = arr[i];
                    }
                }
            }
            answer[x++] = tmp == 1_000_001 ? -1 : tmp;
        }
        return answer;
    }
}