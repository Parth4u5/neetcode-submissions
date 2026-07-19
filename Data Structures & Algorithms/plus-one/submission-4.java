class Solution {
    public int[] plusOne(int[] digits) {
        int left = 0 , right = digits.length - 1;
        int newArray[] = new int[digits.length + 1];
        for(int i=right;i>=left;i--){
            
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
            newArray[0] = 1;
        }
        return newArray;
    }
}
