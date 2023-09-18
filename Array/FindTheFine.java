/**
 * Given an array of penalties fine[], an array of car numbers car[], and also the date. The task is to find the total fine which will be collected on the given date. Fine is collected from odd-numbered cars on even dates and vice versa.

 

Example 1:

Input:
N = 4, date = 12
car[] = {2375, 7682, 2325, 2352}
fine[] = {250, 500, 350, 200}
Output:
600
Explantion:
The date is 12 (even), so we collect the
fine from odd numbered cars. The odd
numbered cars and the fines associated
with them are as follows:
2375 -> 250
2325 -> 350
The sum of the fines is 250+350 = 600

 

Example 2:

Input:
N = 3, date = 8
car[] = {2222, 2223, 2224}
fine[] = {200, 300, 400}
Output:
300



Your Task:  
You don't need to read input or print anything. Your task is to complete the function totalFine() which takes the array car[] and fine[] its size N and an integer date as inputs and returns the total fine.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 105
1 <= Cari <= 105
1 <= Date <= 105
1 <= Finei <= 105

 */


//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
// import java.lang.*;
import java.io.*;


class FindTheFine {
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long k = Long.parseLong(stt.nextToken());
            
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            long b[] = new long[(int)(n)];
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(inputLine1[i]);
            }
            
            Solution7 obj = new Solution7();
            System.out.println(obj.totalFine(n, k, a, b));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution7 {
    
    public long totalFine( long n, long date, long car[], long fine[])
    {
        boolean oddNoEvenFlag = true;
        if (date % 2 == 0) oddNoEvenFlag = false;
        
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (oddNoEvenFlag && car[i] % 2 == 0) {
                sum += fine[i];
            } else if (!oddNoEvenFlag && car[i] % 2 != 0) {
                sum += fine[i];
            }
        }
        
        return sum; 
    }
}