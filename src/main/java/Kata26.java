import java.util.List;
/* Input:
a string strng
an array of strings arr

Output of function contain_all_rots(strng, arr) (or containAllRots or contain-all-rots):
a boolean true if all rotations of strng are included in arr
false otherwise */
public class Kata26 {
    public static boolean containAllRots(String strng, List<String> arr) {
        if (strng.isEmpty()) {
            return true;
        }
        int strngLength = strng.length();
        for (int i = 0; i < strngLength; i++) {
            String rotation = strng.substring(i) + strng.substring(0, i);
            if (!arr.contains(rotation)) {
                return false;
            }
        }
        return true;
    }
}