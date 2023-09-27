/**
 * Given an array arr[] containing positive elements. A and B are two numbers defining a range. The task is to check if the array contains all elements in the given range.

Example 1:

Input: N = 7, A = 2, B = 5
arr[] =  {1, 4, 5, 2, 7, 8, 3}
Output: Yes
Explanation: It has elements between 
range 2-5 i.e 2,3,4,5

Example 2:

Input: N = 7, A = 2, B = 6
arr[] = {1, 4, 5, 2, 7, 8, 3}
Output: No
Explanation: Array does not contain 6.


Your Task:
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function check_elements() that takes array arr, integer N, integer A, and integer B  as parameters and returns the boolean True if array elements contain all elements in the given range else boolean False.

Note: If the array contains all elements in the given range then driver code outputs Yes otherwise, it outputs No

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).


Constraints:
1 ≤ N ≤ 107
 */

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;

// } Driver Code Ends
//User function Template for Java

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            // int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n = Integer.parseInt(q[0]);
            int k = Integer.parseInt(q[1]);
            int y = Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(a1[i]);
            }
            // String line2 = br.readLine();
            // String[] a2 = line2.trim().split("\\s+");
            // long b[] = new long[n];
            // for (int i = 0; i < m; i++) {
            // b[i] = Long.parseLong(a2[i]);
            // }
            Solution ob = new Solution();
            boolean ans = ob.check_elements(a, n, k, y);
            // System.out.println(ob.shuffleArray(a,n,k,y));
            if (ans)
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }
}

// } Driver Code Ends

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        int total_nums = B - A + 1;
        if (total_nums > n)
            return false;

        for (int i = 0; i < n; i++) {
            // check for the element that is it in the range or not and take the absolute
            // value
            if (Math.abs(arr[i]) >= A && Math.abs(arr[i]) <= B) {
                // if in the range then take out the index and mark that value in index as
                // its negative value
                int indexInArray = Math.abs(arr[i]) - A;
                // do check that it should not be already negative if yes then do not alter it
                if (arr[indexInArray] > 0) {
                    arr[indexInArray] *= -1;
                }
            }
        }

        // at last check that whether all the elements in the range of array are -v or
        // not
        int range = B - A + 1;
        for (int i = 0; i < range; i++) {
            if (arr[i] > 0)
                return false;
        }
        return true;
    }
}

// { Driver Code Starts.
