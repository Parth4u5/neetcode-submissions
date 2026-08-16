class Solution {
    // we are creating an hashset to store entry on those numbers 
    // whose occurences are already marked
    HashSet<Integer> set = new HashSet<>();
    public boolean hasDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            //now check if perticular number existing in table 
            if(set.contains(nums[i])){
                // if yes then return true
                return true;
            }
            //else add that value into hashtable
            set.add(nums[i]);
        }
        //else return false
        return false;
    }
}
