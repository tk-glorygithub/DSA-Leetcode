public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        //  String binary = Integer.toBinaryString(n);
        //  String reversed = new StringBuilder(binary).reverse().toString();
         
        //  return (int)Long.parseLong(reversed,2);

       int reverse=0;
        for(int i=1;i<=32;i++){
            reverse=reverse<<1;
            reverse=reverse | (1&n); //1&n gets you the rightmost bit
            n=n>>1;
        }
        return reverse;
    }
}