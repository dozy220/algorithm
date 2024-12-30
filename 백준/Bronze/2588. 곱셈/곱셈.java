import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        StringBuilder sb = new StringBuilder(String.valueOf(b));
        String str = sb.reverse().toString();
        
        int[] arr = Arrays.stream(str.split("")).map(e -> Integer.valueOf(e)).mapToInt(e -> e).toArray();
        
        for (int n : arr) System.out.println(a*n);
        System.out.println(a*b);
    }
}