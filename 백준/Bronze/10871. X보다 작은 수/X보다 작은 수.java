import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        StringTokenizer st1 = new StringTokenizer(sc.nextLine());

        int[] num = new int[Integer.parseInt(st.nextToken())];
        int x = Integer.parseInt(st.nextToken());

        for (int i=0; i<num.length; i++) {
            num[i] = Integer.parseInt(st1.nextToken());
        }

        for (int i=0; i<num.length; i++) {
            if ( x > num[i]) {
                System.out.print(num[i]+" ");
            }
        }
    }
}