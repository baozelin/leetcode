package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_78_good {
	private List<List<Integer>> ret = new ArrayList<List<Integer>>();
	
	public List<List<Integer>> subsets(int[] nums) {
        if(nums == null) return ret;
        
        List<Integer> list = new ArrayList<Integer>();
        
        //different size subsets
        //Arrays.sort(nums);
        for(int i = 0; i <= nums.length; i++){
            backtracking(list, nums, i, 0);
        }
        
        return ret;
    }
	
	
	public void backtracking(List<Integer> list, int[] nums, int size, int start){
		if(list.size() == size) {
			ret.add(new ArrayList<Integer>(list));
			return;
		}
		
		for(int i = start; i < nums.length; i++) {
			int num = nums[i];
			list.add(num);
			backtracking(list, nums, size, i+1);
			list.remove(list.size()-1);
		}
	
	}
	
	 public static void main(String[]arg) {
		 Subsets_78_good t = new Subsets_78_good();
	    	List<List<Integer>> tmp = new ArrayList<List<Integer>>();
	    	int[] in = new int[] {1,2,2};
	    	tmp = t.subsets(in);
	    	System.out.println("list:");
	    	System.out.println(tmp.size());
	    	for(int i = 0; i < tmp.size(); i++){
	
	    		System.out.println(tmp.get(i));
	    	}
	    }
}
