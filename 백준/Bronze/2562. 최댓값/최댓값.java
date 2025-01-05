import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<9; i++) {
            list.add(sc.nextInt());
        }

        int max = list.stream().max(Integer::compare).get();
        System.out.println(max);
        System.out.println(list.indexOf(max) + 1);
    }
}