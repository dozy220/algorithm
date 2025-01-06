import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int leng = sc.nextInt();
        sc.nextLine();
        String num = sc.nextLine();
        sc.close();
        int sum = 0;

        for (int i=0; i<leng; i++) {
            sum += (num.charAt(i) - '0');
        }

        System.out.println(sum);
    }
}