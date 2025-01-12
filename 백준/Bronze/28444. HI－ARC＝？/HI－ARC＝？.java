import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int i = sc.nextInt();
        int a = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.println((h*i) - (a*r*c));
    }
}
