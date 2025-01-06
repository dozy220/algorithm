import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i=0; i<num; i++) {
            int cnt = sc.nextInt();
            String str = sc.next();
            String result = "";
            for (int j=0; j<str.length(); j++) {
                for (int k=0; k<cnt; k++) {
                    result += str.charAt(j)+"";
                }
            }
            bfw.write(result+"\n");
        }
        sc.close();
        bfw.flush();
        bfw.close();
    }
}