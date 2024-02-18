// Complete the function so that it finds the average of the three scores passed
// to it and returns the letter value associated with that grade.
public class Kata15 {
    public static void main(String[] args) {
        System.out.println(getGrade(40, 50, 30));
    }
    public static char getGrade(int s1, int s2, int s3) {
        int average = (s1 + s2 + s3) / 3;

        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}