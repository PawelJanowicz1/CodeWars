/* Complete the solution so that it splits the string into pairs of two characters.
 If the string contains an odd number of characters then it should replace the missing second character of the final
  pair with an underscore ('_').


 */
public class Kata9 {
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");

    }
}