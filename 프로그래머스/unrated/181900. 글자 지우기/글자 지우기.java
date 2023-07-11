import java.util.List;
import java.util.ArrayList;

class Solution {
    public static String solution(String my_string, int[] indices) {
        char[] chArr = my_string.toCharArray();

        for (int n : indices) {
            chArr[n] = '-';
        }

        return new String(chArr).replaceAll("-", "");
    }
}