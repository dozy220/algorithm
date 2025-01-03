import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if (a == b && b == c) 
            System.out.println(10_000 + (a * 1000));
        else
            if (a == b || b == c || a == c)
                System.out.println(1_000 + ((a == b ? a : c) * 100));
            else
                System.out.println((a > b ? Math.max(a, c) : Math.max(b, c)) * 100);
    }
}