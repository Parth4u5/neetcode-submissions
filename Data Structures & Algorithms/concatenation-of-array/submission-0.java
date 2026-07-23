class Solution {
    public int[] getConcatenation(int[] nums) {
        int newArray[] = new int[2*nums.length];

        int i=0;
        for(int num : nums){
            newArray[i++] = num;
        }
        for(int num : nums){
            newArray[i++] = num;
        }
        return newArray;
    }
}