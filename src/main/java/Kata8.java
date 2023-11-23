/* You receive an array with your peers' test scores. Now calculate the average and compare your score!
Return True if you're better, else False!
 */
public class Kata8 {public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int totalScore = 0;
    for(int score : classPoints){
        totalScore =+ score;
    }
    totalScore =+ yourPoints;
    double average = (double)totalScore / (classPoints.length + 1);
    return yourPoints > average;
    }
}