import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        sc.close();

        System.out.print((23 < (h += (m+x)/60) ? h-24 : h) + " " + (m+x)%60);
    }
}