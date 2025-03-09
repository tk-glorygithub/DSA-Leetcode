import java.util.Arrays;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Arrays.sort(arr);
        // int[] unique = new int[arr.length];
        // int idx =0;

        // for(int i = 0 ;i<arr.length ;i++){
        //     int count =1;

        //     // count occourences of the current element
        //     while(i+1 <arr.length &&  arr[i] == arr[i+1]){
        //         count ++;
        //         i++;

        //     }
        //     unique[idx++] = count;

        // }
        // Arrays.sort(unique);
        // for(int i =1;i<unique.length;i++){
        //     if(unique[i] == unique[i-1]){
        //         return false;
        //     }
        // }
        // return true;

        Map<Integer , Integer>freq = new HashMap<>();
        for(int x :arr){
            freq.put(x, freq.getOrDefault(x,0)+1);
        }
        Set<Integer> s = new HashSet<>();
        for(int x : freq.values()){
            s.add(x);
        }
      return freq.size() == s.size();
    }
}