class Solution {
    public int alternateDigitSum(int n) {
          int  sum = 0;
       String str = Integer.toString(n);
        for(int i = 0; i<str.length();i++){
            int digit = str.charAt(i)-'0';
         
            if( i%2 ==0){
               // i = (-i);
                sum +=(digit);
            }
            else{
               sum -=digit;
            }
      
    }
    
        return sum;
}
} 

/*
  class Solution {
    public int alternateDigitSum(int n) {
        int num = n;
        int count = 0;
        
        // Count total number of digits
        while (num > 0) {
            count++;
            num /= 10;
        }
        
        int sum = 0;
        int sign = (count % 2 == 0) ? -1 : 1; // Start with correct sign based on digit count
        
        while (n > 0) {
            int digit = n % 10; // Extract last digit
            sum += sign * digit; // Apply sign
            sign = -sign; // Alternate sign
            n /= 10; // Remove last digit
        }
        
        return sum;
    }
} */
