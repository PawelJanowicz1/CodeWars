import java.sql.PreparedStatement;

/*Given a string indicating a range of letters,
 return a string which includes all the letters in that range, including the last letter.
  Note that if the range is given in capital letters, return the string in capitals also!
public class Kata14 {
    public static String gimmeTheLetters(String s) {
        if (s == null || s.length() < 3 || s.charAt(1) != '-') {
            return "";
        }
        char start = s.charAt(0);
        char end = s.charAt(2);
        StringBuilder sb = new StringBuilder();

        for (char c = start; c <= end; c++) {
                sb.append(c);
        }
return sb.toString();
    }
}


