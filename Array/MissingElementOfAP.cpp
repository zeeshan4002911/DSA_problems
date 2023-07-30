/**
 *
 * Find the missing element from an ordered array arr[], consisting of N elements representing an Arithmetic Progression(AP).

Note: There always exists an element which upon inserting into sequence forms Arithmetic progression. Boundary elements (first and last elements) are not missing.

Example 1:

Input:
N = 6
Arr[] = {2, 4, 8, 10, 12, 14}
Output: 6
Explanation: Actual AP should be
2, 4, 6, 8, 10, 12, 14.


Example 2:

Input:
N = 6
Arr[] = {1, 6, 11, 16, 21, 31}
Output: 26
Explanation: Actual AP should be
1, 6, 11, 16, 21, 26, 31.


Your Task:
You don't need to read input or print anything. Your task is to complete the function findMissing() which takes the array of integers arr[] and its size n as input parameters and returns an integer denoting the answer.


Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1)


Constraints:
2 <= N <= 105
0 <= |Arr[i]| <= 107
There will always be only one missing element.

*/

//{ Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function template for C++

class Solution
{
public:
    int findMissing(int arr[], int n)
    {
        int diff = (arr[n - 1] - arr[0]) / n;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] != arr[i - 1] + diff) {
                return arr[i - 1] + diff;
            }
        }
        return arr[n - 1] + diff; 
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        int arr[n];
        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.findMissing(arr, n);
        cout << ans << "\n";
    }
    return 0;
}

// } Driver Code Ends