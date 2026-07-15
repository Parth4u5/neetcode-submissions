class Solution {
    public boolean isPalindrome(String s) {
            s = s.trim();
        int left = 0 , right = s.length() - 1;


        while(left < right){
            

            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            char ch1 = Character.toLowerCase(s.charAt(left));
            char ch2 = Character.toLowerCase(s.charAt(right));

           if(ch1==ch2){
            left++;
            right--;
           }else{
            return false;
           }
        }
        return true;
    }
}
