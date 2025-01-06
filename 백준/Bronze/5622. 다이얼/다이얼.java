import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        char[] exep = {'S', 'V', 'Y', 'Z'};

        int sec = 0;

        for (int i=0; i<str.length(); i++) {
            for (char ch : exep)
                if (str.charAt(i) == ch) sec -= 1;
            sec += (str.charAt(i) - 62) / 3;
        }

        sec += str.length()*2;
        System.out.println(sec);
    }
}