import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] chess = {1, 1, 2, 2, 2, 8};

        for (int i=0; i<chess.length; i++) {
            chess[i] -= sc.nextInt();
        }
        sc.close();

        for (int i : chess) {
            System.out.print(i + " ");
        }
    }
}