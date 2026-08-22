class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();//created hashmap 
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0)+1);//calculating frequency of numbers in array num
        }
        int maxCount = 0;//maxCount for calculating majority occurences of number not maximum value
        int ans = 0;
        for(int count : map.keySet()){// we have calculated the frequency now from the hashmap keySet method will manages the key value that we have assigned to that perticular value , here it is as count of occurences
            if(map.get(count) > maxCount){
                maxCount = map.get(count);//update maxCount to key value of numbers occurence
                ans = count;// we are storing maximum frequency here 
            }
        }
        return ans;
    }
}
