class Solution {
    public String[] solution(String[] str_list) {        
        String[] answer = new String[]{};

        for (int i=0; i<str_list.length; i++) {
            if (str_list[i].equals("l")) {
                String[] tmp = new String[i];
                System.arraycopy(str_list, 0, tmp, 0, i);
                answer = tmp;
                break;
            } else if (str_list[i].equals("r")){
                String[] tmp = new String[str_list.length - i - 1];
                System.arraycopy(str_list, i+1, tmp, 0, str_list.length - i - 1);
                answer = tmp;
                break;
            }
        }

        return answer;
    }
}