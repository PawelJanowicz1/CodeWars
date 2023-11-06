import java.util.Arrays;
import java.util.Comparator;

//Simply find the closest value to zero from the list.
public class Kata16 {

    public static Integer find(int[] arr) {
        if(arr.length == 1) {
            return arr[0];
        }
        arr = Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted(Comparator.comparingInt(Math::abs))
                .mapToInt(Integer::intValue)
                .limit(2)
                .toArray();
        return Math.abs(arr[0]) == Math.abs(arr[1]) ? null : arr[0];
    }

}
