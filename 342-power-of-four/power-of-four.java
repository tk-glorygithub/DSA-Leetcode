class Solution {
    public boolean isPowerOfFour(int n) {
           for (double i = 0; i < 31; i++) {
            double ans =  Math.pow(4, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }
    }
