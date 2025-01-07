import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] needs_chess = new int[chess.length];

        for (int i=0; i<chess.length; i++) {
            needs_chess[i] = chess[i] - sc.nextInt();
        }
        sc.close();

        for (int i=0; i<needs_chess.length; i++) System.out.print(needs_chess[i]+" ");
    }
}