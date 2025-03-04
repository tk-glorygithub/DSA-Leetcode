class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
          
           for(long i =1;i<31;i++){
             if( power(2,i) == n){
            return true;
            }
           }
       
        return false;
       
    }
    public static long power(long base ,long raise){
        if(raise ==0){
            return 1;
        }
        
            return base* power(base ,(raise-1));
        
    }
}



// left shift
// class Solution {
//     public boolean isPowerOfTwo(int n)  {
//         if (n <= 0) return false; 
        
//         for (int i = 0; i < 31; i++) { // 31 because 2^31 exceeds int range
//             if ((1 << i) == n) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }








