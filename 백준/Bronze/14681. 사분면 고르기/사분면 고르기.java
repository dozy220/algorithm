import java.util.*;

public class Main {
    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (0 < a)
            System.out.println(0 < b ? 1 : 4);
        else
            System.out.println(0 < b ? 2 : 3);
    }
}