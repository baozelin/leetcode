package Search二Dmatrix;


/*
 * [
  [1, 3, 5, 7],
  [2, 4, 7, 8],
  [3, 5, 9, 10]
]

Given target = 3, return 2.

O(m+n) time and O(1) extra space
 */
public class Search2DMatrix_count {
	public int searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix == null || matrix.length ==0) return 0;
        if(matrix[0] == null || matrix[0].length == 0) return 0;
        
        int n = matrix.length;
        int m = matrix[0].length;
        int x = n -1;
        int y = 0;
        int count = 0;
        
        while(x >= 0 && y < m){
            if(matrix[x][y] < target) y++;
            else if(matrix[x][y] > target) x--;
            else{
                count++;
                x--;
                y++;
            }
        }
        return count;
    }
}
