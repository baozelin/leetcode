package 搜索;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import 排序.SortCharactersByFrequency_451;

public class SubsetsII_90 {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
	       ArrayList<Integer> tmp = new ArrayList<Integer>();
	       Arrays.sort(nums);
	       res.add(tmp);
	       dfs(res,tmp,nums,0);
	       return res;
	    }
	    
	    public void dfs(List<List<Integer>> res, ArrayList<Integer> tmp, int[] nums, int pos){
	        for(int i=pos;i<=nums.length-1;i++){
	            tmp.add(nums[i]);
	            res.add(new ArrayList<Integer>(tmp));
	            dfs(res,tmp,nums,i+1);
	            tmp.remove(tmp.size()-1);
	            while(i<nums.length-1 && nums[i]==nums[i+1]) i++;  
	        }
	    }
	    
	    
	    
	    public void test(int num) {
	    	//for(int i=0;i<=num;i++){
	      if(num > 0) {
	    	System.out.println("前面" + num);
	            test(num-1);
	           /// i = 0;
	            System.out.println("中间：" + num);
	            test(num-1);
	            System.out.println("后面：" + num);
	            
	        }
	    }
	 //   }
 
	    public static void main(String[]arg) {
	    	SubsetsII_90 t = new SubsetsII_90();
			 int[] S = new int[] {1,2,2};
			 t.subsetsWithDup(S);
			 t.test(5);
		 }
}
