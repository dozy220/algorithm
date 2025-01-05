import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);
        String str = "";
        int t, a, b =0;
        t = sc.nextInt(); 
        sc.nextLine();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i=0; i<t; i++) {
            str = sc.nextLine();
            StringTokenizer st = new StringTokenizer(str);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            result.add(a+b);
        }

        for (int i=0; i<t; i++) {
            System.out.println(result.get(i));
        }
    }
}