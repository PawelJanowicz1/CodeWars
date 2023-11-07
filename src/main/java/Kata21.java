import java.util.Map;
import java.util.HashMap;

public class Kata21 {
    public static int zeroes(int base, int number) {
        Map<Integer, Integer> baseFactors = primeFactorization(base);
        int trailingZeroes = Integer.MAX_VALUE;

        for (int primeFactor : baseFactors.keySet()) {
            int power = primeFactor;
            int count = 0;
            while (power <= number) {
                count += number / power;
                power *= primeFactor;
            }
            count /= baseFactors.get(primeFactor);
            trailingZeroes = Math.min(trailingZeroes, count);
        }
        return trailingZeroes;
    } private static Map<Integer, Integer> primeFactorization(int n) {
        Map<Integer, Integer> factors = new HashMap<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                n /= i;
                factors.put(i, factors.getOrDefault(i, 0) + 1);
            }
        }
        if (n > 1) {
            factors.put(n, factors.getOrDefault(n, 0) + 1);
        }
        return factors;
    }

    public static void main(String[] args) {
        int base = 10; // Example base
        int number = 10; // Example number
        int result = zeroes(base, number);
        System.out.println("Number of trailing zeroes: " + result);
    }
}

