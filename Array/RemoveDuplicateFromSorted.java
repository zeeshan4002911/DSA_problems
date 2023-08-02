/**
 * Given a sorted array A[] of size N, delete all the duplicated elements from A[]. Modify the array such that if there are X distinct elements in it then the first X positions of the array should be filled with them in increasing order and return the number of distinct elements in the array.

Note:
1. Don't use set or HashMap to solve the problem.
2. You must return the number of distinct elements(X) in the array, the driver code will print all the elements of the modified array from index 0 to X-1 as output of your code.

Example 1:

Input:
N = 5
Array = {2, 2, 2, 2, 2}
Output: 2
Explanation: After removing all the duplicates only one instance of 2 will remain i.e. {2} so modify array will contains 2 at first position and you should return 1 after modify the array.

Example 2:

Input:
N = 4
Array = {1, 2, 2, 4}
Output: 1 2 4
Explation: After removing all duplicates modify array will contains {1, 2, 4} at first 3 positions so you should return 3 after modify the array.


Your Task:  
You don't need to read input or print anything. Complete the function remove_duplicate() which takes the array A[] and its size N as input parameters and modifies it in place to delete all the duplicates. The function must return an integer X denoting the no. of distinct elements in the array keeping first X elements of array in increasing order. 


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 104
1 ≤ A[i] ≤ 106
 */

//{ Driver Code Starts
//Initial Template for Java

// import java.io.*;
import java.util.*;

public class RemoveDuplicateFromSorted {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++)
                a[i] = sc.nextInt();

            Solution g = new Solution();
            int n = g.remove_duplicate(a, N);

            for (int i = 0; i < n; i++)
                System.out.print(a[i] + " ");
            System.out.println();
            T--;
        }
        sc.close();
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    int remove_duplicate(int A[], int N) {
        // code here
        int j = 0;
        for (int i = 1; i < N; i++) {
            if (A[i] != A[j]) {
                j++;
                A[j] = A[i];
            }
        }
        return j + 1;
    }
}
