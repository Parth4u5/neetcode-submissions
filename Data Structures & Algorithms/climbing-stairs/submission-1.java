// here this the problem of climbing stairs 
// contraint is you can climb either 1 or 2 stairs 
// which is standard fibbonaci problem 
// ways(i) =  ways(i-1) + ways(i-2) 
// to reach at i you need to be at either i-1 or i-2 
// here also We have used traditional Dynamic Programming approach to store current result at each step to avoid space complexity as well as time complexity 
class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int firstStep = 1;
        int secondStep = 2;

        int currentStep = 0;
        for(int i=3;i<=n;i++){
            currentStep = firstStep + secondStep;
            firstStep = secondStep;
            secondStep = currentStep;
        }
        return secondStep;
    }
}
