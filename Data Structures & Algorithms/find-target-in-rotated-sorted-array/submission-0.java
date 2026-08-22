class Solution {
    public int search(int[] nums, int target) {
        int left = 0 , right = nums.length - 1;
        while(left <= right){
            int mid = left +(right - left)/2;

            if(nums[mid] == target){
                return mid;
            }
            if(nums[left]<=nums[mid]){// here it is saying that left half of the array is sorted 
                if(nums[left]<=target && target < nums[mid]){
                    right = mid - 1;//target relays in left side of the array so end will become now mid-1
                }else{
                    left = mid + 1;//or start from the other side of mid
                }
            }else{//here it is saying that right half of the array is sorted
                if(nums[mid]<target && target <= nums[right]){//find in that sorted part
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
//DEBUG TESTS :
//Array = {7 , 9 , 11 , 0 , 1 , 2 , 3}
//Target = 1
// left = 0 , right = 7
//mid = 0 + (7-0)/2 = 0 + (7)/2 = 0 + 3 = 3 , 3rd index is mid
//if nums[3] == 1 => 0 == 1 false , move forward
//if nums[0]<=nums[3] => 0 <= 0 True means left half is sorted
//if nums[0]<=1 && 1<=0 false => left = mid + 1 , means here 7 , 9 , 11 , 0 (These elements are elementaed from search) , now search in 1 , 2 , 3
//continue with loop and you will find at the end target 1 
