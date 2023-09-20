
/**
 * Given two strings S1 and S2 in lowercase, the task is to make them anagram. The only allowed operation is to remove a character from any string. Find the minimum number of characters to be deleted to make both the strings anagram. Two strings are called anagram of each other if one of them can be converted into another by rearranging its letters.

Example 1:

Input:
S1 = bcadeh
S2 = hea
Output: 3
Explanation: We need to remove b, c
and d from S1.

Example 2:

Input:
S1 = cddgk
S2 = gcd
Output: 2
Explanation: We need to remove d and
k from S1.

Your Task:
Complete the function remAnagram() which takes two strings S1, S2 as input parameter, and returns minimum characters needs to be deleted.

Expected Time Complexity: O(max(|S1|, |S2|)), where |S| = length of string S.
Expected Auxiliary Space: O(26)

Constraints:
1 <= |S1|, |S2| <= 105
 *///{ Driver Code Starts
    //saksham raj seth
import java.util.*;

class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String s1 = sc.next();
            GfG g = new GfG();
            System.out.println(g.remAnagrams(s, s1));
        }
        sc.close();
    }
}
// } Driver Code Ends

/* Complete the function below */
class GfG {
    public int remAnagrams(String s, String s1) {
        // add code here.
        int[] countArr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            countArr[ch - 'a']++;
        }

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            countArr[ch - 'a']--;
        }

        int result = 0;
        for (int num : countArr) {
            result += Math.abs(num);
        }
        return result;
    }
}
