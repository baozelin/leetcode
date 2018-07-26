package 递归;

import java.util.HashMap;





public class SingleNumber_136 {
	/**
	 * 用了异或
	 */
	
	    public int singleNumber(int[] nums) {
	        int num=0;
	        for(int i=0;i<nums.length;i++)
	            {
	            num=num^nums[i];
	        }
	        return num;
	    }
	    
	    
	    public static void main(String[]arg) {
	    	SingleNumber_136 t = new SingleNumber_136();
	    	
	    	int[] aa = new int[] {4,1,2,1,2};
			 int n = t.singleNumber(aa);
			System.out.println(n);
	
		 }
	
	
	
	public int singleNumber3(int[] nums) {
	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	for(int c:nums) {
	map.put(c, map.getOrDefault(c, 0) + 1);
	}
	
	for(Integer key : map.keySet()){
      if(map.get(key) == 0) return map.get(key);
    }
	return 0;
	}
}
