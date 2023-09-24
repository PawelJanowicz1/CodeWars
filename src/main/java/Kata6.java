/*  There are pillars near the road. The distance between the pillars is the same and the width of the pillars is the same.
 Your function accepts three arguments:

number of pillars (≥ 1);
distance between pillars (10 - 30 meters);
width of the pillar (10 - 50 centimeters).
Calculate the distance between the first and the last pillar in centimeters (without the width of the first and last pillar).
 */
public class Kata6 {
    public static int pillars(int numPill, int dist, int width) {
        if(numPill < 1){
            throw new IllegalArgumentException("numPill cant be less than 1");
        } else if (dist < 10 || dist > 30){
            throw new IllegalArgumentException("dist is too short or too long");
        } else if (width < 10 || width > 50){
            throw new IllegalArgumentException("width is too short or too long");
        } if (numPill == 1) {
            return 0;
        }
        int distInCm = dist * 100;
        int total = (numPill - 1) * distInCm + (numPill -2) * width;
        return total;
    }
}