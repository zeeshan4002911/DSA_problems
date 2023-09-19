/**
 * Given a sorted array containing only 0s and 1s, find the transition point. 


Example 1:

Input:
N = 5
arr[] = {0,0,0,1,1}
Output: 3
Explanation: index 3 is the transition 
point where 1 begins.


Example 2:

Input:
N = 4
arr[] = {0,0,0,0}
Output: -1
Explanation: Since, there is no "1",
the answer is -1.


Your Task:
You don't need to read input or print anything. The task is to complete the function transitionPoint() that takes array and N as input parameters and returns the 0 based index of the position where "0" ends and "1" begins. If array does not have any 1s, return -1. If array does not have any 0s, return 0.


Expected Time Complexity: O(LogN)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 500000
0 ≤ arr[i] ≤ 1

 */

//{ Driver Code Starts
import java.util.*;

class FindTrasisitionPoint {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG2 obj = new GfG2();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
        sc.close();
    }
}
// } Driver Code Ends

class GfG2 {
    int transitionPoint(int arr[], int n) {
        if (arr[0] == 1)
            return 0;
        if (arr[n - 1] == 0)
            return -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == 1 && arr[i - 1] == 0)
                return i;
        }
        return -1;
    }
}
