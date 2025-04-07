class Solution {
    public int missingNumber(int[] nums) {
        // int n =nums.length;
        // for(int i=0;i<n;i++){

        //     int count =0;
        //     for(int j=0;j<n;j++){
        //         if(nums[j]==i){
        //             count++;
        //             break;
        //         }
        //     }
        //     if(count ==0){
        //         return i;
        //     }
        // }
        // return 0;

        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i!= nums[i]){
                return i;
            }
            
        }
    return n;
    }
}