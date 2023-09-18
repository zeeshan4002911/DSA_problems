/*
Check if strings are rotations of each other or not
BasicAccuracy: 43.83%Submissions: 107K+Points: 1
Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 

Given two strings s1 and s2. The task is to check if s2 is a rotated version of the string s1. The characters in the strings are in lowercase.

 

Example 1:

Input:
geeksforgeeks
forgeeksgeeks
Output: 
1
Explanation: s1 is geeksforgeeks, s2 is
forgeeksgeeks. Clearly, s2 is a rotated
version of s1 as s2 can be obtained by
left-rotating s1 by 5 units.

 

Example 2:

Input:
mightandmagic
andmagicmigth
Output: 
0
Explanation: Here with any amount of
rotation s2 can't be obtained by s1.

 

Your Task:
The task is to complete the function areRotations() which checks if the two strings are rotations of each other. The function returns true if string 1 can be obtained by rotating string 2, else it returns false.

 

Expected Time Complexity: O(N).
Expected Space Complexity: O(N).
Note: N = |s1|.

 

Constraints:
1 <= |s1|, |s2| <= 107
 */

import java.io.*;

class StringRotationOrNot {

    public static void main(String[] args) throws IOException {

        // taking input using BufferedReader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // taking total count of testcases
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            // Reading the two Strings
            String s1 = br.readLine();
            String s2 = br.readLine();

            // Creating an object of class Rotate
            Solution obj = new Solution();

            // calling areRotations method
            // of class Rotate and printing
            // "1" if it returns true
            // else "0"
            if (obj.areRotations(s1, s2)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
// } Driver Code Ends

class Solution {
    // Function to check if two strings are rotations of each other or not.
    public boolean areRotations(String s1, String s2) {
        // Your code here
        if (s1.length() != s2.length())
            return false;

        String s3;
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            s3 = s1.substring(i, n) + s1.substring(0, i);
            System.out.println(s3);
            if (s3.equals(s2)) {
                return true;
            }
        }

        return false;
    }

}