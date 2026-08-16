class Solution {
    public int[] getConcatenation(int[] nums) {
        // This is common sense that after merging two arrays size will become double of its normal size
        int newArray[] = new int[2*nums.length];

        int i=0;
        for(int num : nums){
            // we are storing nums elements in newArray and  updating  to next position
            newArray[i++] = num;
        }
        
        for(int num : nums){
            //it is like we are doubling the same array 
            // Actually we are not doing merging of two different arrays we are just doubling same array into newArray
            newArray[i++] = num;
        }
        return newArray;
    }
}
