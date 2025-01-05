import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sum = new int[n];

        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum[i] = a+b;
        }
        sc.close();

        for(int i=0; i<n; i++) System.out.println("Case #" + (i+1) + ": " + sum[i]);
    }
}