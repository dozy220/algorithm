import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int tpow = 0;

        for (int i=1; i<=a; i++) {
            sum += i;
            tpow += i*i*i;
        }

        System.out.println(sum);
        System.out.println(sum * sum);
        System.out.println(tpow);
    }
}
