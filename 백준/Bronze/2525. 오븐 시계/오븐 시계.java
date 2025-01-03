import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        h += (m+n)/60;
        m = (m+n)%60;

        if (23 < h) System.out.print(h-24 + " " + m);
        else System.out.println(h + " " + m);
    }
}