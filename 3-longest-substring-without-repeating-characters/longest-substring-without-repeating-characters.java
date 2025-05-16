class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
       int maxLen = 0;
       int left =0;

       for(int i = 0 ; i<s.length();i++){
        if(!set.contains(s.charAt(i))){
            set.add(s.charAt(i));
            maxLen = Math.max(maxLen,i- left+1);
        }
        else{
            while(s.charAt(left)!= s.charAt(i)){
                set.remove(s.charAt(left));
                left++;
            }
            set.remove(s.charAt(left));
            left++;
            set.add(s.charAt(i));
        }

       } 
       return maxLen++;
    }
}