//Complete the solution so that it reverses the string passed into it.
public class Kata18 {
    public static String solution(String str) {
       StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
