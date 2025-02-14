class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        ArrayList<Integer> Num = new ArrayList<>();
        int arr [] = new int[n];
        if(n==1) return new ArrayList<>();
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
        ArrayList<List<Integer>>ans=new ArrayList<>();
        int  i=0;
        int j = Num.size()-1;

        while(i <=j){
            List <Integer>l = new ArrayList<>();
            if(Num.get(i) +Num.get(j) ==n){
                l.add(Num.get(i));
                l.add(Num.get(j));
                ans.add(l);
                i++;
                j--;

            }
            else if(Num.get(i) +Num.get(j)<n)i++;
            else j--;
        }
        return ans;
    }
}