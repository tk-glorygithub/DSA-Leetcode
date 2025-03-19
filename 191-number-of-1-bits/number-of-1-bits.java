class Solution {
    public int hammingWeight(int n) {
        int count = 0;
          String binary = Integer.toBinaryString(n);
       
     for(char i = 0;i<binary.length();i++){
  
      if(binary.charAt(i) =='1'){
           count +=1;
        }

       }
       return count;
    }
}