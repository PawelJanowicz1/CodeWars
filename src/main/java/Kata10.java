/*Take 2 strings s1 and s2 including only letters from a to z.
Return a new sorted string, the longest possible,
 containing distinct letters - each taken only once - coming from s1 or s2.
 */
public class Kata10 {
        public static String longest (String s1, String s2){
            StringBuilder sb = new StringBuilder();
            (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
            return sb.toString();
        }
    }
