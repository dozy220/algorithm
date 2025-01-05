import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] basket = new int[n];

        for (int i=0; i<m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int num = sc.nextInt();

            for (int j=start-1; j<end; j++) {
                basket[j] = num;
            }
        }
        sc.close();
        System.out.println(
                Arrays.toString(basket)
                        .replace("[", "")
                        .replace("]", "")
                        .replace(",", ""));
    }
}