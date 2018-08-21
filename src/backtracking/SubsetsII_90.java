package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII_90 {
private List<List<Integer>> ret = new ArrayList<List<Integer>>();
    

//solution1
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if(nums == null) return ret;
        List<Integer> list = new ArrayList<Integer>();
        //boolean[] visited  
        Arrays.sort(nums);
        //different size
        for(int i = 0; i <= nums.length; i++){
            backtracking(list, nums, i, 0);
        }
        return ret;
    }
    
    void backtracking(List<Integer> list, int[] nums, int size, int start){
        if(list.size() == size){
        	
            List<Integer> tmp = new ArrayList<Integer>(list);
            if(!ret.contains(tmp))
                ret.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i = start; i< nums.length; i++){
        	//different
        	if (i != 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
            //
        	int num = nums[i];
            list.add(num);
            backtracking(list, nums, size, i+1);
            list.remove(list.size()-1);
        }
    }
    
    
    //solution2
//private List<List<Integer>> ret = new ArrayList<List<Integer>>();
	private boolean[] visited;
	public List<List<Integer>> subsets2(int[] nums) {
        if(nums == null) return ret;
        
        List<Integer> list = new ArrayList<Integer>();
       
        //different
        visited = new boolean[nums.length];
        
        for(int i = 0; i <= nums.length; i++){
            backtracking2(list, nums, i, 0);
        }
        return ret;
    }
	
	
	public void backtracking2(List<Integer> list, int[] nums, int size, int start){
		if(list.size() == size) {
			ret.add(new ArrayList<Integer>(list));
			return;
		}
		
		for(int i = start; i < nums.length; i++) {
			int num = nums[i];
			list.add(num);
			visited[i] = true;
			backtracking2(list, nums, size, i+1);
			list.remove(list.size()-1);
			visited[i] = false;
		}
	
	}
	
	 public static void main(String[]arg) {
		 SubsetsII_90 t = new SubsetsII_90();
	    	List<List<Integer>> tmp = new ArrayList<List<Integer>>();
	    	int[] in = new int[] {4,4,4,1,4};
	    	tmp = t.subsets2(in);
	    	
	    	System.out.println("list:");
	    	System.out.println(tmp.size());
	    	for(int i = 0; i < tmp.size(); i++){
	    		//System.out.println("list:11");
	    		System.out.println(tmp.get(i));
	    	}
	    }
    
}
