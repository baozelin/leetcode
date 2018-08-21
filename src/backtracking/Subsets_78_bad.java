package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_78_bad {
	private List<List<Integer>> ret = new ArrayList<List<Integer>>();
    
	
	/**
	 * over time limit
	 * 
	 * 
	 */
    public List<List<Integer>> subsets(int[] nums) {
        if(nums == null) return ret;
        
        List<Integer> list = new ArrayList<Integer>();
        //different size subsets
        
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length; i++){
            backtracking(list, nums, i);
        }
        return ret;
    }
    
    public void backtracking(List<Integer> list, int[] nums, int size){
        if(list.size() == size) {
            List<Integer> tmp = new ArrayList<Integer>(list);
            tmp.sort(null);
            if(!ret.contains(tmp))
                ret.add(tmp);
            return; 
        }
        
        for(int j = 0; j < nums.length; j++){
            int num = nums[j];
            if(list.contains(num)) continue;
            list.add(num);
            backtracking(list, nums, size);
            list.remove(list.size()-1);
        }
    }
    
    
    public static void main(String[]arg) {
    	Subsets_78_bad t = new Subsets_78_bad();
    	List<List<Integer>> tmp = new ArrayList<List<Integer>>();
    	int[] in = new int[] {1,2,3,4,5,6,7,8,9};
    	tmp = t.subsets(in);
    	System.out.println("list:");
    	System.out.println(tmp.size());
    	for(int i = 0; i < tmp.size(); i++){
    		//System.out.println("list:11");
    		System.out.println(tmp.get(i));
    	}
    }
}
