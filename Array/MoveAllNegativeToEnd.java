/*
Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

 

Example 1:

Input : 
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5


Example 2:

Input : 
N=8
arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
Output :
7  9  10  11  -5  -3  -4  -1

 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function segregateElements() which takes the array arr[] and its size N as inputs and store the answer in the array arr[] itself.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
 


Constraints:
1 ≤ N ≤ 105
-105 ≤ arr[] ≤ 105

 */


//{ Driver Code Starts

//{ Driver Code Starts
//Initial Template for Java

// import java.util.*;
// import java.lang.*;
import java.io.*;

class MoveAllNegativeToEnd {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution13 obj = new Solution13();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution13 {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int[] arr2 = new int[n];
        int k = 0;
        for (int x: arr) {
            if (x > 0) {
                arr2[k] = x;
                k++;
            }
        }
        for (int x: arr) {
            if (x < 0) {
                arr2[k] = x;
                k++;
            }
        }
        System.arraycopy(arr2, 0, arr, 0, n);
    }
}