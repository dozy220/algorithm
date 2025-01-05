import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int cnt = sc.nextInt();
        int product_sum = 0;

        for (int i=0; i<cnt ;i++) {
            int product_cost = sc.nextInt();
            int product_cnt = sc.nextInt();
            product_sum += product_cost * product_cnt;
        }
        sc.close();

        if (sum == product_sum) System.out.println("Yes");
        else System.out.println("No");
    }
}