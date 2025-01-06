import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        String[] str = new String[num];

        for (int i=0; i<num; i++) {
            str[i] = sc.nextLine();
        }

        for (int i=0; i<num; i++) {
            str[i] = str[i].substring(0,1) + str[i].substring(str[i].length()-1);
        }

        for (int i=0; i<num; i++) {
            System.out.println(str[i]);
        }

    }
}