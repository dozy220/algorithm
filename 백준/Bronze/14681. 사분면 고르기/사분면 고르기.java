import java.util.*;

public class Main {
    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (0<a && 0<b) System.out.println(1);
        else if (a<0 && 0<b) System.out.println(2);
        else if (a<0 && b<0) System.out.println(3);
        else if (0<a && b<0) System.out.println(4);
    }
}