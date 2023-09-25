/**
 * Given a string S consisting of the characters 0, 1 and 2. Your task is to find the length of the smallest substring of string S that contains all the three characters 0, 1 and 2. If no such substring exists, then return -1.

Example 1:

Input:
S = "01212"
Output:
3
Explanation:
The substring 012 is the smallest substring
that contains the characters 0, 1 and 2.

Example 2:

Input: 
S = "12121"
Output:
-1
Explanation: 
As the character 0 is not present in the
string S, therefor no substring containing
all the three characters 0, 1 and 2
exists. Hence, the answer is -1 in this case.

Your Task:
Complete the function smallestSubstring() which takes the string S as input, and returns the length of the smallest substring of string S that contains all the three characters 0, 1 and 2.

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ |S| ≤ 105
All the characters of String S lies in the set {'0', '1', '2'}

 */

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        // Code here
        int n = S.length();

        // Initialize a count of each character
        Map<Character, Integer> count = new HashMap<>();
        count.put('0', 0);
        count.put('1', 0);
        count.put('2', 0);

        // Initialize pointers and minimum length
        int left = 0, right = 0;
        int minLength = Integer.MAX_VALUE;

        while (right < n) {
            // Update the count for the character at the right pointer
            char rightChar = S.charAt(right);
            count.put(rightChar, count.get(rightChar) + 1);

            // Check if all characters are present in the current window
            while (count.get('0') > 0 && count.get('1') > 0 && count.get('2') > 0) {
                // Update the minimum length
                minLength = Math.min(minLength, right - left + 1);

                // Move the left pointer to try to minimize the window
                char leftChar = S.charAt(left);
                count.put(leftChar, count.get(leftChar) - 1);
                left++;
            }

            // Move the right pointer to expand the window
            right++;
        }

        // If the minimum length is still Integer.MAX_VALUE, no such substring exists
        if (minLength == Integer.MAX_VALUE) {
            return -1;
        }

        return minLength;
    }
};
