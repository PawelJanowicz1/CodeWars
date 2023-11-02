import java.util.Arrays;
/*Write a function which calculates the average of the numbers in a given list.
        Note: Empty arrays should return 0.
 */
public class Kata13 {
    public static double find_average(int[] array) {
       return Arrays.stream(array).average().orElse(0);
    }
}