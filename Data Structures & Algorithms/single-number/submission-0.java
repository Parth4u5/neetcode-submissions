class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0)+1);
        }
        
        for(int count : map.keySet()){
            if(map.get(count) == 1) {
                return count;
            }
        } 
        return 1;
    }
}
