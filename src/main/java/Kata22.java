import java.util.SortedSet;
import java.util.TreeSet;
/* Given parameter n the function dbl_linear
(or dblLinear...) returns the element u(n) of the ordered (with <) sequence u
(so, there are no duplicates).

*/
public class Kata22 {
    public static int dblLinear(int n) {
        SortedSet<Integer> sequence = new TreeSet<>();
        sequence.add(1);
        for (int i = 0; i < n; i++) {
            int current = sequence.first();
            sequence.add(2 * current + 1);
            sequence.add(3 * current + 1);
            sequence.remove(current);
        }
        return sequence.first();
    }
    public static void main(String[] args) {
        int n = 10; // Example value of n
        int result = dblLinear(n);
        System.out.println("dblLinear(" + n + ") should return " + result);
    }
}