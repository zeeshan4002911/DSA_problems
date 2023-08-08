import java.util.Scanner;

/**
 * Given an integer n, return the number of prime numbers that are strictly less
 * than n.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: n = 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 * 
 * Example 2:
 * 
 * Input: n = 0
 * Output: 0
 * 
 * Example 3:
 * 
 * Input: n = 1
 * Output: 0
 * 
 */

class countPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(countPrimesNum(n));
    }

    public static int countPrimesNum(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            boolean breakFlag = false;
            inner: for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    breakFlag = true;
                    break inner;
                }
            }
            if (!breakFlag) {
                count++;
            }
        }
        return count;
    }
}