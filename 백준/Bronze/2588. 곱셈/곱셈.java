import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int mul = a*b;
        for (int i = 0; i < 3; i++) {
            System.out.println(a * (b % 10));
            b /= 10;
        }

        System.out.println(mul);
    }
}