class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0)+1);
        }
        int maxCount = 0;
        int ans = 0;
        for(int count : map.keySet()){
            if(map.get(count) > maxCount){
                maxCount = map.get(count);
                ans = count;
            }
        }
                return ans;
    }
}