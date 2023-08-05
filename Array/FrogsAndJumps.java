/**
 * N frogs are positioned at one end of the pond. All frogs want to reach the other end of the pond as soon as possible. The pond has some leaves arranged in a straight line. Each frog has the strength to jump exactly K leaves. For example, a  frog having strength 2 will visit the leaves 2, 4, 6, ...  etc. while crossing the pond.

Given the strength of each frog and the number of leaves, your task is to find the number of leaves that not be visited by any of the frogs when all frogs have reached the other end of the pond. 

Example 1:

Input:
N = 3
leaves = 4
frogs[] = {3, 2, 4} 
Output: 1
Explanation:
Leaf 1 will not be visited by any frog.

Example 2:

Input: 
N = 3
leaves = 6
frogs[] = {1, 3, 5} 
Output: 0
Explanation: 
First frog will visit all the leaves so no 
leaf is left unvisited.

Your Task:
Complete the function unvisitedLeaves() which takes the integers N, leaves and the array frogs as the input parameters, and returns the number of unvisited leaves.

Expected Time Complexity: O(N*log(leaves))
Expected Auxiliary Space: O(leaves)

Constraints:
1 ≤ N, leaves, frogs[i] ≤ 105

 */

//{ Driver Code Starts
//Initial Template for Java

// import java.util.*;
// import java.lang.*;
import java.io.*;

class FrogsAndJumps {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String inputLine1[] = br.readLine().trim().split(" ");
            int i = 0;
            int N = Integer.parseInt(inputLine1[i++]);
            int leaves = Integer.parseInt(inputLine1[i++]);

            int frogs[] = new int[(int) (N)];

            String inputLine2[] = br.readLine().trim().split(" ");
            for (i = 0; i < N; i++) {
                frogs[i] = Integer.parseInt(inputLine2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.unvisitedLeaves(N, leaves, frogs));

        }
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
        boolean[] visitedLeave = new boolean[leaves + 1];
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (frogs[i] < leaves + 1 && !visitedLeave[frogs[i]]) {
                int j = 0;
                while (j < leaves + 1) {
                    if (!visitedLeave[j]) {
                        visitedLeave[j] = true;
                        count++;
                    }
                    j += frogs[i];
                }
            }
        }
        return leaves - count + 1;
    }
}
