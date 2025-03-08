class Solution {
    public String removeDuplicates(String s) {
      Stack <Character> st = new Stack<>();
      // step 1
      st.push(s.charAt(0)); 
      // step 2

      for(int i=1;i<s.length();i++){
        if(st.size()==0){
            st.push(s.charAt(i));
        }else if( s.charAt(i)!=st.peek()){
            st.push(s.charAt(i));
        }else{
      while(st.size()>0 && (st.peek()==s.charAt (i))){
               st.pop ();
       
        }       


     
   
    }
}
StringBuilder sb = new StringBuilder();
     while(st.size()>=0 && st.size()>0){
        sb.append(st.pop());
     }
       sb.reverse();
     return sb.toString();
 
    }
}









