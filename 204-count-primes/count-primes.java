class Solution {
    public int countPrimes(int n) {
         ArrayList<Integer> Num = new ArrayList<>();
        int arr [] = new int[n];
    if(n==0 || n==1)return 0;
         arr[0] = 1;
         arr[1] =1;

        for(int i =2 ;i<n;i++ ){
       if(arr[i] == 0){
       for(int j = i ;j<n ;j+=i){
         arr[j] =1;
       }
       arr[i] =0;

       }

        }
        for(int i = 0;i<n;i++){
            if(arr[i] ==0){
                Num.add(i);
            }
        }
        return Num.size();
    }
}