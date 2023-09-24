// Given a set of numbers, return the additive
// inverse of each. Each positive becomes negatives, and the negatives become positives.
import java.util.Arrays;

public class Kata4 {


    public static int[] invert(int[] array) {
        for(int i = 0; i < array.length; i++){
            array[i] = -array[i];
        }
        return array;
    }
}
