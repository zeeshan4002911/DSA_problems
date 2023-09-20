/**
 * Given two strings S1 and S2 as input, the task is to merge them alternatively i.e. the first character of S1 then the first character of S2 and so on till the strings end.
NOTE: Add the whole string if other string is empty.

Example 1:

Input:
S1 = "Hello" S2 = "Bye"
Output: HBeylelo
Explanation: The characters of both the 
given strings are arranged alternatlively.

â€‹Example 2:

Input: 
S1 = "abc", S2 = "def"
Output: adbecf
Explanation: The characters of both the
given strings are arranged alternatlively.


Your Task:
You don't need to read input or print anything. Your task is to complete the function merge() which takes the strings S1 and S2 as input and returns the resultant string by merging both S1 and S2 alternatively starting from S1.


Expected Time Complexity: O(|S1| + |S2|).
Expected Auxiliary Space: O(1).


Constraints:
1<=|S1|, |S2| <=103

 */

// { Driver Code Starts
// Initial Template for Java
import java.io.*;

class MergeString {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while (t-- > 0) {
            String input_line[] = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution ob = new Solution();
            System.out.println(ob.merge(S1, S2));
        }
    }
}
// } Driver Code Ends

// User function Template for Java
class Solution {
    String merge(String S1, String S2) {
        // code here
        StringBuilder result = new StringBuilder();
        int s1 = S1.length(), s2 = S2.length(), i = 0, j = 0;
        while (i < s1 && j < s2) {
            result.append(S1.charAt(i++));
            result.append(S2.charAt(j++));
        }

        while (i != S1.length()) {
            result.append(S1.charAt(i++));
        }
        while (j != S2.length()) {
            result.append(S2.charAt(j++));
        }
        return result.toString();
    }
}