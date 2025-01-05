import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);
        String str = "";
        int a, b =0;
        ArrayList<Integer> result = new ArrayList<>();

        while (true) {
            str = sc.nextLine();
            StringTokenizer st = new StringTokenizer(str);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if (a+b == 0) break;
            else result.add(a+b);
        }

        for (int i=0; i<result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}