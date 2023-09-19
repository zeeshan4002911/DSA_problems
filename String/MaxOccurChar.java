/**
 * Given a string str of lowercase alphabets. The task is to find the maximum occurring character in the string str. If more than one character occurs the maximum number of time then print the lexicographically smaller character.

Example 1:

Input:
str = testsample
Output: e
Explanation: e is the character which
is having the highest frequency.

Example 2:

Input:
str = output
Output: t
Explanation:  t and u are the characters
with the same frequency, but t is
lexicographically smaller.

Your Task:
The task is to complete the function getMaxOccuringChar() which returns the character which is most occurring.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).
Note: N = |s|

Constraints:
1 ≤ |s| ≤ 100
 */

//{ Driver Code Starts
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String line = br.readLine().trim();

            Solution4 obj = new Solution4();

            System.out.println(obj.getMaxOccuringChar(line));

        }
    }
}
// } Driver Code Ends

class Solution4 {
    // Function to find the maximum occurring character in a string.
    public char getMaxOccuringChar(String line) {
        // Your code here
        int[] frequency = new int[26];
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            frequency[ch - 'a']++;
        }

        char maxChar = 'a';
        int maxFrequency = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (frequency[ch - 'a'] > maxFrequency) {
                maxChar = ch;
                maxFrequency = frequency[ch - 'a'];
            }
        }
        return maxChar;
    }

}