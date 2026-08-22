class Solution {
    public boolean isPalindrome(String s) {
            s = s.trim();// trim down the string to remove extra whitespace for better comparision
        int left = 0 , right = s.length() - 1;

// we are using standard two pointers approach 
        while(left < right){
            
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){//here isLetterOrDigit checks whether the number relays in (a-z) or (A-Z) or (0-9)
                //it will ignore characters except alphanumeric 
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
//DEBUG TEST CASE :
//String s = "racecar" this is palindrome string
//left  = 0 , right = 7
//while (0<7){
//while(0<7 && !Character.isLetterOrDigit(s.charAt(0) = r)) , compare at chatAt(0) and check whether it is LetterOrDigit relays (a-z) or (A-Z) or (0-9)
//now do it from right side // increment left and decrement right 
//store results in ch1 =  left and ch2 = right
//compare ch1 == ch2 // if stays same throughout characters then continue moving
// else return false







