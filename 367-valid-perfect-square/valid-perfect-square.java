class Solution {
    public boolean isPerfectSquare(int num) {
        boolean Perfect = false;
        for(long i = 1;i<= num;i++){
       if(i *i == num){
      Perfect  = true;
        break;
       }


        }
        return Perfect ;
    }
}