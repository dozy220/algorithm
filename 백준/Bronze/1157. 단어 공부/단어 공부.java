import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        str = str.toUpperCase();
        Map<Character, Integer> alpaCnt = new HashMap<>();

        for (int i=0; i<str.length(); i++) {
            Character ch = str.charAt(i);
            if (alpaCnt.containsKey(ch)) alpaCnt.put(ch, alpaCnt.get(ch)+1);
            else alpaCnt.put(ch, 1);
        }

        int max = alpaCnt.values().stream().mapToInt(e -> e).max().getAsInt();
        List<Character> alpaList = alpaCnt.keySet().stream().collect(Collectors.toList());
        String result = "";

        for (Character alpa : alpaList) {
            if (alpaCnt.get(alpa) == max) result += alpa;
        }

        if (result.length() > 1) System.out.println("?");
        else System.out.println(result);
    }
}