/**
 * Given a stack, the task is to sort it such that the top of the stack has the
 * greatest element.
 * 
 * Example 1:
 * 
 * Input:
 * Stack: 3 2 1
 * Output: 3 2 1
 * 
 * Example 2:
 * 
 * Input:
 * Stack: 11 2 32 3 41
 * Output: 41 32 11 3 2
 * 
 * Your Task:
 * You don't have to read input or print anything. Your task is to complete the
 * function sort() which sorts the elements present in the given stack. (The
 * sorted stack is printed by the driver's code by popping the elements of the
 * stack.)
 * 
 * Expected Time Complexity: O(N*N)
 * Expected Auxilliary Space: O(N) recursive.
 * 
 * Constraints:
 * 1<=N<=100
 */

//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;

class SortedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Integer> s = new Stack<>();
            int n = sc.nextInt();
            while (n-- > 0)
                s.push(sc.nextInt());
            GfG g = new GfG();
            Stack<Integer> a = g.sort(s);
            while (!a.empty()) {
                System.out.print(a.peek() + " ");
                a.pop();
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends

/* Complete the function below */
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        
        return s;
    }
}