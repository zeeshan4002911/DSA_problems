/**
 * Given a binary string, that is it contains only 0s and 1s. We need to make this string a sequence of alternate characters by flipping some of the bits, our goal is to minimize the number of bits to be flipped.

Example 1:

Input:
S = "001"
Output: 1
Explanation: 
We can flip the 0th bit to 1 to have
101.


Example 2:

Input:
S = "0001010111" 
Output: 2
Explanation: We can flip the 1st and 8th bit 
bit to have "0101010101"
101.


Your Task:
You don't need to read input or print anything. Your task is to complete the function minFlips() which takes the string S as input and returns the minimum number of flips required.


Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).


Constraints:
1<=|S|<=105
 */

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String S = br.readLine().trim();
            Solution ob = new Solution();

            System.out.println(ob.minFlips(S));

        }
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    public int minFlips(String S) {
        // Code here
        int count_ptr1 = 0, count_ptr2 = 0;
        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0 && S.charAt(i) == '0') {
                count_ptr1++;
            } else if (i % 2 == 0 && S.charAt(i) == '1') {
                count_ptr2++;
            } else if (S.charAt(i) == '1') {
                count_ptr1++;
            } else if (S.charAt(i) == '0') {
                count_ptr2++;
            }
        }
        return Math.min(count_ptr1, count_ptr2);
    }
}