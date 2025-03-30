class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;


        int []prefProduct = new int [n];
        prefProduct[0]= 1;

        for(int i=1;i <n ;i++){
prefProduct[i] =prefProduct[i-1] *nums[i-1];
        }
        int suffix =1;

        for(int i =n-1 ;i>=0;i--){
            prefProduct[i] *= suffix;
            suffix = suffix *nums[i];
        }
        //prefProduct[0] = suffix;
        return prefProduct;
    }
}