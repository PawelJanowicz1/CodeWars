import java.util.Arrays;
/*Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.

Note: input will never be an empty string


 */
public class Kata11 {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[] {};
        int count = 0,sum = 0;
        for (int i : input) {
            if (i > 0) count ++;
            if (i < 0) sum += i;
        }
        return new int[] {count,sum};
    }
}