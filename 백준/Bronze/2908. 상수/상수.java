import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        System.out.println(Math.max(rev(n1), rev(n2)));
    }
    
    static int rev(int n) {
        int result = 0;
        for (int i=String.valueOf(n).length(); i>0; i--) {
            result = result * 10 + n % 10;
            n /= 10;
        }
        return result;
    }
}