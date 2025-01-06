import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        sc.close();

        String str1r = "";
        String str2r = "";

        for (int i=2; i>=0; i--) {
            str1r = str1r + str1.charAt(i);
            str2r = str2r + str2.charAt(i);
        }

        int a =  Integer.parseInt(str1r);
        int b =  Integer.parseInt(str2r);

        if (a > b) System.out.println(a);
        else System.out.println(b);
    }
}