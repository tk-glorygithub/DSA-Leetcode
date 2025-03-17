class Solution {
    public int calculate(String s) {
        int i =0;
        int cur = 0, prev =0 , res =0;
        char curOperation ='+';

        while(i <s.length()){
            char curChar = s.charAt(i);

            if(Character.isDigit(curChar)){
                cur= 0;
                while(i < s.length() && Character.isDigit(s.charAt(i)))
                {
                    cur = cur *10 + (s.charAt(i) -'0');
                    i++;
                }
                i--;
                if (curOperation == '+'){
                    res += cur;
                    prev = cur;
                }
                else if(curOperation == '-'){
                    res -=cur;
                    prev  = -cur;
                }
                else if(curOperation == '*'){
                    res -= prev;
                    prev *= cur;
                    res += prev;
                }
                else if(curOperation == '/'){
                    res -= prev;
                    prev  = prev /cur;
                    res += prev;
                }
            }
            else if(curChar != ' '){
                curOperation = curChar;
            }
            i++;
        }
        return res;
    }
}