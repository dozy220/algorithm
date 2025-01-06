import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String str = bfr.readLine();

        for (int i=97; i<123; i++) {
            System.out.print(str.indexOf(i));
            System.out.print(" ");
        }
        
    }
}