import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] num = new double[n];

        for (int i=0; i<n; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(num);
        double big = num[num.length-1];

        for (int i=0; i<n; i++) {
            num[i] = num[i]/big * 100;
        }

        double avr = Arrays.stream(num).average().getAsDouble();
        System.out.println(avr);
    }
}