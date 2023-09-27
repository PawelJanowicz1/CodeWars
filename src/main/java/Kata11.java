import java.util.Arrays;

public class Kata11 {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        int count = 0;
        int sum = 0;
        for (int i : input) {
            if (i > 0) {
                count++;
            }
            if (i < 0) {
                sum += i;
            }

        }return new int[]{};
    }
}