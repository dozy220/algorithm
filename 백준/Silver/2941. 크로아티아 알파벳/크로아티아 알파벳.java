import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        List<String> ca = Arrays.asList("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        int cnt = 0;

        while(!str.isEmpty()) {
            if(str.length() >= 3 && ca.contains(str.substring(0, 3))) {
                str = str.substring(3);
            } else if (str.length() >= 2 && ca.contains(str.substring(0, 2))) {
                str = str.substring(2);
            } else {
                str = str.substring(1);
            }
            cnt++;
        }

        System.out.println(cnt);
    }
}

