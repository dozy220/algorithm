import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(bfr.readLine());

        for (int i = 0; i < num; i++) {
            String str = bfr.readLine();
            StringTokenizer st = new StringTokenizer(str);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bfw.write(a+b+"\n");
        }

        bfr.close();
        bfw.flush();
        bfw.close();
    }
}