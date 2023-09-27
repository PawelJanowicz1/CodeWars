public class Kata10 {
        public static String longest (String s1, String s2){
            StringBuilder sb = new StringBuilder();
            (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
            return sb.toString();
        }
    }
