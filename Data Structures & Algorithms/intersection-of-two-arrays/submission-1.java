class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for(int i : nums1){
            seen.add(i);
        }
        for(int i : nums2){
            if(seen.contains(i)){
                common.add(i);
                seen.remove(i);
            }
        }
        int resultArr[] = new int[common.size()];
        int j = 0;
        for(int val : common){
            resultArr[j] = val; 
            j++;
        }
        return resultArr;
    }
}