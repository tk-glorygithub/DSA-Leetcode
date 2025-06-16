class Solution {
    public int findGCD(int[] nums) {
        
        
              Arrays.sort(nums);
      int min = nums[0];
        int max = nums[nums.length-1];
        return gcd(min ,max);

        }
        private int gcd(int x,int y){
            if( y==0){
                return x;
            }
            return gcd(y ,x%y);
        }


    }
