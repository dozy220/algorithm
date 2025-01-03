import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int hh = sc.nextInt();
        int mm = sc.nextInt();
        sc.close();

        if (mm >= 45) System.out.println(hh + " " + (mm-45));
        else if (mm < 45 && hh >= 1) System.out.println((hh-1) + " " + (mm-45+60));
        else if (mm < 45 && hh == 0) System.out.println(23 + " " + (mm-45+60));
    }
}