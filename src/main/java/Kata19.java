/* Implement a function that receives two IPv4 addresses, and returns the number of addresses between them
 (including the first one, excluding the last one).
All inputs will be valid IPv4 addresses in the form of strings. The last address will always be greater than the first one. */
public class Kata19 {
    public static long ipsBetween(String start, String end) {
        return convertToLong(end) - convertToLong(start);
    }

    private static long convertToLong(String ip) {
        long res = 0;
        for (String s : ip.split("[.]") )
            res = res * 256 + Long.parseLong(s);
        return res;
    }
}