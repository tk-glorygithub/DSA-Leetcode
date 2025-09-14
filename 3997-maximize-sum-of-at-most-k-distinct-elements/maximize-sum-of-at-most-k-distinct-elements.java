class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        
        TreeSet<Integer> p = new TreeSet<Integer>();
       for(int i =0;i<nums.length;i++)
       {
        p.add(nums[i]);

       }
	 // System.out.println(p);
	  ArrayList<Integer> L = new ArrayList<>();
	  Iterator<Integer> desc = p.descendingIterator();
	  int cnt =0;
	  while(desc.hasNext() && cnt <k)
		{
		  L.add(desc.next());
		 cnt++; 
		 
		  
		}
		 int[] result = new int[L.size()];
        for (int i = 0; i < L.size(); i++) {
            result[i] = L.get(i);
        }

        return result;
    }
}