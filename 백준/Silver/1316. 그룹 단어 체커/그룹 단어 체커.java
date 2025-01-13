import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        int cnt = 0;

        for (int i=0; i<n; i++) {
            String str = sc.nextLine();

            if (str.length() == 1) {
                cnt++;
            } else {
                String c = str.substring(0, 1);
                String s = str.substring(1);

                while (!s.isEmpty()) {
                    if (s.indexOf(c) != 0 && s.contains(c)) {
                        break;
                    } else if (s.indexOf(c) == 0) {
                        if (s.length() > 1)
                            s = s.substring(1);
                        else {
                            cnt++;
                            break;
                        }
                    } else {
                        c = s.substring(0, 1);
                        s = s.substring(1);
                        if (s.isEmpty()) cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}

