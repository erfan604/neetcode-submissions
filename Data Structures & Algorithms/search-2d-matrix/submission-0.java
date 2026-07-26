class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROW = matrix.length;
        int COL = matrix[0].length;
        int left = 0;
        int right = ROW * COL - 1;

        while (left <= right){
            int mid = left + ((right - left) / 2);
            if(matrix[mid / COL][mid % COL] == target){
                return true;
            }else if(matrix[mid / COL][mid % COL] < target){
                left = mid + 1;
            }else if(matrix[mid / COL][mid % COL] > target){
                right = mid - 1;
            }
        }
        return false;
    }
}
