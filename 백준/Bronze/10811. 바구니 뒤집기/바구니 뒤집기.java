import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n = sc.nextInt();
        int[] basket = new int[size];

        for (int i=1; i<=size; i++) {
            basket[i-1] = i;
        }

        for (int i=0; i<n; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;

            for (int j=a; j<=b; j++) {
                int tmp = basket[j];
                basket[j] = basket[b];
                basket[b] = tmp;
                b--;
            }
        }
        sc.close();
        System.out.println(Arrays.toString(basket)
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }
}