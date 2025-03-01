class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<Integer>list=new ArrayList<>();
        for(int i=1;i<=rowIndex+1;i++){
			long a=1;
            if(i==rowIndex+1){
               for(int j=1;j<=i;j++){
				list.add((int)a);
				a=(int)(a*(i-j)/j);
			   }
            }		
		}
       return list; 
    }
}

