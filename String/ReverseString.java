package String;
/**
 * 
Reverse a String
BasicAccuracy: 69.49%Submissions: 290K+Points: 1
Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 

You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG

Example 2:

Input:
s = for
Output: rof

Your Task:

You only need to complete the function reverseWord() that takes s as parameter and returns the reversed string.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).

Constraints:
1 <= |s| <= 10000 */

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class ReverseString {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Reverse {
    // Complete the function
    // str: input string
    public static String reverseWord(String str) {
        // Reverse the string str
        String[] arr = str.split("");
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        str = String.join("", arr);
        return str;
        // char[] charArr = str.toCharArray();
        // String result = "";
        // for (int i = charArr.length - 1; i >= 0; i--)
        //     result += charArr[i];
        // return result;
    }
}