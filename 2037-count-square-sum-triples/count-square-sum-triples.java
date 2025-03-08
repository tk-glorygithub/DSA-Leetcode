class Solution {
    public int countTriples(int n) {
       int ans = 0;
       for(int a = 0;a <= n-1 ;a++){

        for(int  b = 1;b<= a;b++){

            for(int c =b+1;c<=n;c++){
                int LHS = a*a +b*b;
                int RHS = c*c;
                if( LHS == RHS){
                    ans += 2;
                }
            }
        }
       }
   return ans;
    }
}