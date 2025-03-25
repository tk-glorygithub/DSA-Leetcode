class Solution {
    public int[] twoSum(int[] nums, int target) {
        
     HashMap<Integer,Integer>hm=new HashMap<>();
      
    for(int i=0;i<nums.length;i++){
        int a=target-nums[i];
        if(hm.containsKey(a)){
           return new int[]{hm.get(a),i};
        }
        hm.put(nums[i],i);
    }
    return new int[]{}; 

    } 
} 
/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int arr[]=new int[2];
       arr[0]=arr[1]=-1;
       for(int i=0;i<nums.length-1;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]+nums[j]==target){
                   arr[0]=i;
                   arr[1]=j;
                   
               }
           }
         } 
       return arr;
    }
}  
*/