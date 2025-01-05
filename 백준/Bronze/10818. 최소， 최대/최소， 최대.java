import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int leng = sc.nextInt();
        int[] num = new int[leng];

        for (int i=0; i<leng; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(num);
        int min = num[0];
        int max = num[leng-1];
        
        System.out.println(min + " " + max);
    }
}