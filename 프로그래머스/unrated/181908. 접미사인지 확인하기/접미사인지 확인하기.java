class Solution {
    public int solution(String my_string, String is_suffix) {
        int sub = (my_string.length() - is_suffix.length());
        if (sub < 0) return 0;
        return my_string.substring(sub).equals(is_suffix) ? 1 : 0;
    }
}