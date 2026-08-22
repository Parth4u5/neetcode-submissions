class Solution {
    public int maxArea(int[] heights) {
        //again we are using standard two pointer approach here 
        int left = 0 , right = heights.length-1;
        int maxArea = 0;// this is the area of maximum water we are gonna calculate soon 
        while(left < right){
            int area = Math.min(heights[left] , heights[right])*(right-left);//here we are calculating standard rectangular area using formula height * width
            //(right-left) is width here
            maxArea = Math.max(maxArea , area);//finding maximum area
            if(heights[left]<heights[right]){// we want to make maximum space to store the water 
                left++;//because we want equal surface usually 
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
