import java.text.ChoiceFormat;
import java.util.*;

public class Main {
    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String p = "0#F|60#D|70#C|80#B|90#A";
        System.out.println(new ChoiceFormat(p).format(a));
    }
}