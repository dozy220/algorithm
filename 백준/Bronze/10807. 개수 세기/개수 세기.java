import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        bfr.readLine();
        String s_num = bfr.readLine();
        StringTokenizer st = new StringTokenizer(s_num);
        int n = Integer.parseInt(bfr.readLine());
        int result = 0;

        while (st.hasMoreTokens()) {
            if ( Integer.parseInt(st.nextToken()) == n ) result++;
        }

        System.out.println(result);
    }
}