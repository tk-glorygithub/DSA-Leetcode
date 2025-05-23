class Solution {
    public boolean isPalindrome(int x) {
          int  lastDigit =0;
        int reverse =0;
        int Num =x;

        while(x>0){

            lastDigit =   (x%10);
            reverse = (reverse*10)+lastDigit;
            x =x/10;
        }
        if(reverse == Num){
            return true;
        }
        return false;

        
    }
}