import java.util.*;

public class Main {
    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a>b) System.out.println('>');
        else if (a<b) System.out.println('<');
        else if (a==b) System.out.println("==");
    }
}