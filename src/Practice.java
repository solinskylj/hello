import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Hello Github");

        List<Integer> allGrades = Arrays.asList(5, 3, 2, 6, 3);
        int [] grades = new int[allGrades.size()];

        for(int i = 0; i < allGrades.size(); i++) {
            grades[i] = allGrades.get(i);
        }

        System.out.println(Arrays.toString(grades));
    }
}
