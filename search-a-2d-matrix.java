class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s = 0;
        int e = (matrix.length * matrix[0].length)-1;
        while (s<=e){
            int mid = (s+e)/2;
            int row_index = mid/matrix[0].length;
            int col_index = mid%matrix[0].length;
            
            if (matrix[row_index][col_index]==target){
                return true;
            
            }
            else if (matrix[row_index][col_index] < target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return false;
    } 
}
