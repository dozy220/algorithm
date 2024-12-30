import java.util.*;

public class Main {
    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input);

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        System.out.println(a+b+c);
    }
}