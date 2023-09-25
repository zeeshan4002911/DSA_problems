/**
 * Given a number N, your task is to complete the function which generates all n-bit grey code sequences, a grey code sequence is a sequence such that successive patterns in it differ by one bit.

Example 1:

Input:
N = 2
Output: 00 01 11 10
Explanation: All 2-bit gray codes are
00, 01, 11, 10 such that successive
patterns in it differ by one bit.

Example 2:

Input:
N = 1
Output: 0 1

 

Your Task:
Complete the function generateCode() which takes an integer as input parameter and retruns an array of all N bit grey code sequence such that successive patterns in it differ by one bit.

Expected Time Complexity: O(N * 2N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 16

 */

//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.LinkedList;

class GreyCode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            Solution g = new Solution();
            ArrayList<String> res = g.generateCode(n);
            for (String i : res)
                System.out.print(i + " ");
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends

/*
 * Returns an array of all n-bit gray codes sequence.
 * You are required to complete below method.
 */
class Solution {
    ArrayList<String> generateCode(int n) {
        // Your code here
        ArrayList<String> grayCodes = new ArrayList<>();
        if (n <= 0) {
            return grayCodes;
        }

        // Base case
        if (n == 1) {
            grayCodes.add("0");
            grayCodes.add("1");
            return grayCodes;
        }

        // Generate Gray codes for (n-1) bits
        List<String> prevGrayCodes = generateCode(n - 1);

        // Add 0 prefix to the first half
        for (String code : prevGrayCodes) {
            grayCodes.add("0" + code);
        }

        // Add 1 prefix to the second half (in reverse order)
        for (int i = prevGrayCodes.size() - 1; i >= 0; i--) {
            grayCodes.add("1" + prevGrayCodes.get(i));
        }

        return grayCodes;
    }
}
