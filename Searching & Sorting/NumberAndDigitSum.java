/**
 * Given a positive value N, we need to find the count of numbers smaller than or equal to N such that the difference between the number and sum of its digits is greater than or equal to the given specific value K.

Example 1:

Input:N = 13, K = 2
Output: 4
Explanation: 
10, 11, 12 and 13 satisfy the given condition shown below, 
10 - sumofdigit(10) = 9 >= 2
11 - sumofdigit(11) = 9 >= 2
12 - sumofdigit(12) = 9 >= 2
13 - sumofdigit(13) = 9 >= 2 

Example 2:

Input: N = 10, K = 5
Output: 1
Explanation: 
Only 10 satisfies the givencondition as 
10 - sumofdigit(10) = 9 >= 5


Your Task:
You don't need to read input or print anything. Your task is to complete the function numberCount()which takes an integer N and an integer K as inputs and returns the count of numbers less than or equal to N such that the difference between the number and its sum of digits is greater than K.


Expected Time Complexity: Log(N).
Expected Auxiliary Space: O(1).
 */

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            System.out.println(new Sol().numberCount(n, k));
        }

    }
}
// } Driver Code Ends

// User function Template for Java

class Sol {
    /*
    public static long numberCount(long N, long K) {
        // your code here
        int count = 0;
        for (long num = N; num > 0; num--) {
            long num_temp = num;
            long sum = 0;
            while (num_temp != 0) {
                sum += num_temp % 10;
                num_temp /= 10;
            }
            if (num - sum >= K)
                count++;
        }
        return count;
    }
    */

    // Binary search
    public static long numberCount(long N, long K) {
        // your code here
        long start = 1;
        long end = N;
        while (start <= end) {
            long mid = (start + end) / 2;
            if (mid - digitSum(mid) < K) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (N - end);
    }

    static long digitSum(long n) {
        long sum = 0;
        while (n > 0) {
            long ld = n % 10;
            sum += ld;
            n = n / 10;
        }
        return sum;
    }
}