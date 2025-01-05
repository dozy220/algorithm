import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        StringTokenizer nArrSt = new StringTokenizer(sc.nextLine());
        StringBuilder sb = new StringBuilder();

        st.nextToken();
        int x = Integer.parseInt(st.nextToken());

        while (nArrSt.hasMoreTokens()) {
            int n = Integer.parseInt(nArrSt.nextToken());
            if (n < x)
                sb.append(n).append(" ");
        }

        System.out.println(sb.toString().strip());
    }
}