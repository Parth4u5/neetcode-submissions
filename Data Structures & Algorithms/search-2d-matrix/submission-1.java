class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int stIndex = 0;
        int endIndex = matrix[0].length-1;

        while(stIndex < matrix.length && endIndex >= 0){
            if(matrix[stIndex][endIndex] > target){
                endIndex = endIndex - 1;
            }else if(matrix[stIndex][endIndex] < target){
                stIndex = stIndex + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
