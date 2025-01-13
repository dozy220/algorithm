import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Float> gradeMap = new HashMap<>();
        initGrade(gradeMap);

        float gradeSum = 0;
        float creditsSum = 0;
        float avg = 0.0f;

        for (int i=0; i<20; i++) {
            String n = sc.nextLine();
            StringTokenizer st = new StringTokenizer(n);
            String subject = st.nextToken();
            float credits = Float.parseFloat(st.nextToken());
            String grade = st.nextToken();

            if (!grade.equals("P")) {
                gradeSum += gradeMap.get(grade) * credits;
                creditsSum += credits;
            }
        }

        System.out.println(String.format("%.4f", gradeSum / creditsSum));
    }

    static void initGrade(HashMap<String, Float> map) {
        map.put("A+", 4.5f);
        map.put("A0", 4.0f);
        map.put("B+", 3.5f);
        map.put("B0", 3.0f);
        map.put("C+", 2.5f);
        map.put("C0", 2.0f);
        map.put("D+", 1.5f);
        map.put("D0", 1.0f);
        map.put("F", 0.0f);
    }
}

