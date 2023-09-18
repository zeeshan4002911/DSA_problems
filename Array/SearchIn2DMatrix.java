import java.util.Scanner;

/**
 * You are given an m x n integer matrix matrix with the following two
 * properties:
 * 
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the
 * previous row.
 * 
 * Given an integer target, return true if target is in matrix or false
 * otherwise.
 * 
 * You must write a solution21 in O(log(m * n)) time complexity.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * Output: true
 * 
 * Example 2:
 * 
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * Output: false
 * 
 * 
 * 
 * Constraints:
 * 
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 100
 * -104 <= matrix[i][j], target <= 104
 * 
 * 
 */

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows and columns from the user.
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Create a m*n matrix.
        int[][] matrix = new int[m][n];

        // Get the elements of the matrix from the user.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int target = scanner.nextInt();
        boolean result = Solution21.searchMatrix(matrix, target);
        System.out.println(result);
        scanner.close();
    }
}

class Solution21 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1]) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (target == matrix[i][j])
                        return true;
                }
            }
        }
        return false;
    }
}
