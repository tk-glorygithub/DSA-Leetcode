class Solution {
    public int addDigits(int num) {
      /*  if(num ==0){
            return num;
        }
       int sum = 0;
        for (int i = num; i>0;i/=10){
        int rem = i %10;
        sum = sum + rem; 
     }
     
     int Finalsum = 0;
          for (int i = sum; i>0;i/=10){
        int rem = i %10;
       Finalsum= Finalsum + rem; 
     }
       
        
      return Finalsum;
     */

     int sum = 0;
     while(num>0){
        sum+= (num%10);
        num/=10;
     }
     if(sum<10){
        return sum;
     }
     else{
        return addDigits(sum);
     }
    }
}
