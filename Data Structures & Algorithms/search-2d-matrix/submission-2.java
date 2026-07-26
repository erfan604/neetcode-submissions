class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROW = matrix.length;
        int COL = matrix[0].length;
        int top = 0;
        int bot = ROW - 1;
        int foundAt = -1;

        while (top <= bot){
            int midRow = top + ((bot - top) / 2);

            if (target > matrix[midRow][COL - 1]){
                top = midRow + 1;
            }else if(target < matrix[midRow][0]){
                bot = midRow - 1;
            }else{
                foundAt = midRow;
                break;
            }
        }

        if(foundAt == -1){
            return false;
        }

        int left = 0;
        int right = COL - 1;

        while (left <= right){
            int mid = left + ((right - left) / 2);

            if (target == matrix[foundAt][mid]){
                return true;
            }else if (target > matrix[foundAt][mid]){
                left = mid + 1;
            }else if (target < matrix[foundAt][mid]){
                right = mid - 1;
            }
        }
        return false;
    }
}
