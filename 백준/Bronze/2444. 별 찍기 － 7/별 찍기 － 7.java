import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int line = n*2-1;
        int s = 0;

        for (int i=0; i<line; i++) {
            if (i < n) {
                for (int a=0; a<n-1-i; a++) {
                    System.out.print(" ");
                }
            } else {
                for (int a=0; a<i-n+1; a++) {
                    System.out.print(" ");
                }
            }

            for (int j=0; j<=s; j++) {
                System.out.print("*");
            }
            if (i < n-1) s += 2;
            else s -= 2;

            System.out.println();
        }
    }
}