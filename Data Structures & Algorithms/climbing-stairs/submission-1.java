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
