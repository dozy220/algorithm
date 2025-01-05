import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        int a = 0;
        int b = 0;

        try {
        while (true) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            if (st.hasMoreTokens()) {
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                result.add(a + b);
            } else break;
        }}
        catch (Exception e) {
            
        }

        for (int i=0; i<result.size(); i++) {
            System.out.println(result.get(i));
        }
     }
}