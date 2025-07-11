class Solution {
    public int firstMissingPositive(int[] nums) {
        
            int n = nums.length;
            int i =0;
            while( i<n){
                if(nums[i] == i+1){
                    i++;
                    continue;
                }
                if(nums[i] <= 0 || nums[i] > n){
                    i++;
                    continue;
                }
                int idx1 = i;
                int idx2 = nums[i] -1;

                if(nums[idx1] == nums[idx2]){
                    i++;
                    continue;
                }
                int temp = nums[idx1];
                nums[idx1] = nums[idx2];
                nums[idx2] = temp;
            }
            for(int j = 0;j< n ;j++){
                if(nums[j] != j+1){
                    return j+1;
                }
            }
     return n+1;
    }
}