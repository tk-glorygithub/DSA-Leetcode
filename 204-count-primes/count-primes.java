class Solution {

    public int countPrimes(int n) {
       if(n<=2){

        return 0;
    }
   /* int count =0;
      for(int  i = 2;i<=n;i++){
        for(int j =2 ;j*j<=n;j++){
            if(i%j ==0){
                break;
              
            }
             count++; 
        }
      }
      return count; 
  */

  boolean[] composites = new boolean[n];
  int limit = (int )Math.sqrt(n);
for(int i =2;i <= limit ;i++){
    if(composites[i] == false){
        for(int j = i*i ;j <n; j+=i){
            composites[j] = true;
        }
    }
}
  int count =0;
  for(int i=2 ;i <n;i++){
    if(composites[i] == false) count++;
  }  
  return count; 
    }
}