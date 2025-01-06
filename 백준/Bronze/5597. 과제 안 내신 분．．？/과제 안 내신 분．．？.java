import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {

        Queue<Integer> num = new LinkedList<>();
            for (int i=1; i<31; i++) {
                num.add(i);
            }

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            for (int i=0; i<28; i++) {
                num.remove(Integer.parseInt(bfr.readLine()));
            }

        while (num.size()!=0) {
            System.out.println(num.poll());
        }
    }
}